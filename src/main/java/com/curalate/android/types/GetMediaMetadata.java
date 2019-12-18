//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

public class GetMediaMetadata {
    private String traceId;
    private String requestId;
    private String firstPartyCuid;
    private String curalateUserId;
    private String customCuralateUserId;
    // TODO: add PDP metadata

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getFirstPartyCuid() {
        return firstPartyCuid;
    }

    public void setFirstPartyCuid(String firstPartyCuid) {
        this.firstPartyCuid = firstPartyCuid;
    }

    public String getCuralateUserId() {
        return curalateUserId;
    }

    public void setCuralateUserId(String curalateUserId) {
        this.curalateUserId = curalateUserId;
    }

    public String getCustomCuralateUserId() {
        return customCuralateUserId;
    }

    public void setCustomCuralateUserId(String customCuralateUserId) {
        this.customCuralateUserId = customCuralateUserId;
    }

}

