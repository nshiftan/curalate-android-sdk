//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.exceptions;

public class CuralateApiException extends Exception {

    private int code;
    private String msg;

    public CuralateApiException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CuralateApiException; code = " + code + "; msg = " + msg;
    }
}
