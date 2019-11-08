//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.moshi;

import com.curalate.android.types.NetworkGif;
import com.curalate.android.types.NetworkMedia;
import com.curalate.android.types.NetworkPhoto;
import com.curalate.android.types.NetworkVideo;
import com.squareup.moshi.*;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.io.IOException;
import java.math.BigDecimal;

public class MoshiFactory {
    public static Moshi getInstance() {
        return new Moshi.Builder()
                .add(NetworkMediaJsonAdapter.newInstance())
                .add(new BigDecimalJsonAdapter())
                .build();
    }
}

class BigDecimalJsonAdapter extends JsonAdapter<BigDecimal> {

    @FromJson
    @Override
    public BigDecimal fromJson(JsonReader reader) throws IOException {
        if (reader.peek() == JsonReader.Token.NULL) {
            return reader.nextNull();
        } else {
            return new BigDecimal(reader.nextString());
        }
    }

    @ToJson
    @Override
    public void toJson(JsonWriter writer, BigDecimal value) throws IOException {
        if (value == null) {
            writer.value("");
        } else {
            writer.value(value.toPlainString());
        }
    }
}

class NetworkMediaJsonAdapter {
    public static PolymorphicJsonAdapterFactory<NetworkMedia> newInstance() {
        return PolymorphicJsonAdapterFactory.of(NetworkMedia.class, "type")
                .withSubtype(NetworkPhoto.class, "photo")
                .withSubtype(NetworkVideo.class, "video")
                .withSubtype(NetworkGif.class, "gif");
    }
}

