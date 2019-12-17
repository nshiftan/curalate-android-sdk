//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

public class GetMediaResult {
    private MediaData data;
    private GetMediaMetadata metadata;
    private GetMediaPaging paging;

    public MediaData getData() {
        return data;
    }

    public void setData(MediaData data) {
        this.data = data;
    }

    public GetMediaMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(GetMediaMetadata metadata) {
        this.metadata = metadata;
    }

    public GetMediaPaging getPaging() {
        return paging;
    }

    public void setPaging(GetMediaPaging paging) {
        this.paging = paging;
    }
}

