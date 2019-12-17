//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

public class GetMediaPaging {
    private PagingCursor cursors;
    private String next;
    private String previous;

    public PagingCursor getCursors() {
        return cursors;
    }

    public void setCursors(PagingCursor cursors) {
        this.cursors = cursors;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }
}

