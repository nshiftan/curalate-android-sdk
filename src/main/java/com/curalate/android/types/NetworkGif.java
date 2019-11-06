//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

public class NetworkGif extends NetworkMedia {
    private String id;
    private Image original;

    public MediaType getType() { return MediaType.GIF; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image getOriginal() {
        return original;
    }

    public void setOriginal(Image original) {
        this.original = original;
    }
}
