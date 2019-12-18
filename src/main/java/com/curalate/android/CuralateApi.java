//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android;

import com.curalate.android.exceptions.CuralateApiException;
import com.curalate.android.moshi.MoshiFactory;
import com.curalate.android.requests.GetMediaRequest;
import com.curalate.android.types.*;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class CuralateApi {

    private static final String HOST = "api-2.curalate.com";
    private static final String USER_AGENT = "CuralateAndroidSDK";

    private final OkHttpClient client = new OkHttpClient();

    private final Moshi moshi = MoshiFactory.getInstance();
    private final JsonAdapter<ErrorResult> errorResultJsonAdapter = moshi.adapter(ErrorResult.class);
    private final JsonAdapter<GetMediaResult> getMediaResultJsonAdapter = moshi.adapter(GetMediaResult.class);

    public void getMedia(GetMediaRequest request, ApiHandler<GetMediaResult> handler) throws IOException {

        // Build the URL
        HttpUrl.Builder httpUrlBuilder = new HttpUrl.Builder()
                .scheme("https")
                .host(HOST)
                .encodedPath("/v1/media/" + request.getDataSourceId());

        if (request.getFilter() != null) {
            httpUrlBuilder.addQueryParameter("filter", request.getFilter().toQueryString());
        }
        if (request.getRequireProduct() != null) {
            httpUrlBuilder.addQueryParameter("requireProduct", request.getRequireProduct().toString());
        }
        if (request.getProductMetadata() != null) {
            httpUrlBuilder.addQueryParameter("productMetadata",
                    String.join(",", request.getProductMetadata()));
        }
        if (request.getLocale() != null) {
            httpUrlBuilder.addQueryParameter("locale",
                    request.getLocale().getLanguage() + "_" + request.getLocale().getCountry());
        }
        if (request.getSort() != null) {
            switch (request.getSort()) {
                case LATEST:
                    httpUrlBuilder.addQueryParameter("sort", "Latest");
                    break;
                case LIKES:
                    httpUrlBuilder.addQueryParameter("sort", "Likes");
                    break;
                case MODERATION:
                    httpUrlBuilder.addQueryParameter("sort", "Moderation");
                    break;
                case OPTIMIZED:
                    httpUrlBuilder.addQueryParameter("sort", "Optimized");
                    break;
            }
        }
        if (request.getLimit() != null) {
            httpUrlBuilder.addQueryParameter("limit", request.getLimit().toString());
        }
        if (request.getAfter() != null) {
            httpUrlBuilder.addQueryParameter("after", request.getAfter());
        }
        if (request.getBefore() != null) {
            httpUrlBuilder.addQueryParameter("before", request.getBefore());
        }

        HttpUrl httpUrl = httpUrlBuilder.build();
        Request httpRequest = new Request.Builder()
                .url(httpUrl)
                .addHeader("User-Agent", USER_AGENT)
                .build();

        client.newCall(httpRequest).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                handler.onIOException(e);
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                if (response.isSuccessful()) {
                    GetMediaResult result = getMediaResultJsonAdapter.fromJson(response.body().source());
                    handler.onSuccess(result);
                }
                else {
                    String msg;
                    if (response.body() != null) {
                        ErrorResult result = errorResultJsonAdapter.fromJson(response.body().source());
                        msg = result != null ? result.getMsg() : null;
                    } else {
                        msg = "An unknown error occurred.";
                    }
                    handler.onFailure(new CuralateApiException(response.code(), msg));
                }
            }
        });
    }

    public GetMediaResult getMediaSynchronous(GetMediaRequest request) throws CuralateApiException, IOException, InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        final CuralateApiException[] exceptionHolder = new CuralateApiException[] { null };
        final IOException[] ioExceptionHolder = new IOException[] { null };
        final GetMediaResult[] resultHolder = new GetMediaResult[] { null };
        getMedia(request, new ApiHandler<GetMediaResult>() {
            @Override
            public void onFailure(CuralateApiException e) {
                exceptionHolder[0] = e;
                latch.countDown();
            }

            @Override
            public void onIOException(IOException e) {
                ioExceptionHolder[0] = e;
                latch.countDown();
            }

            @Override
            public void onSuccess(GetMediaResult getMediaResult) {
                resultHolder[0] = getMediaResult;
                latch.countDown();
            }
        });
        latch.await();
        if (exceptionHolder[0] != null) {
            throw exceptionHolder[0];
        } else if (ioExceptionHolder[0] != null) {
            throw ioExceptionHolder[0];
        }
        return resultHolder[0];
    }
}
