//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

public class NetworkVideo extends NetworkMedia {
    private Video original;
    private Video highQuality;
    private Video lowQuality;
    private NetworkPhoto poster;

    public MediaType getType() { return MediaType.VIDEO; }

    public Video getOriginal() {
        return original;
    }

    public void setOriginal(Video original) {
        this.original = original;
    }

    public Video getHighQuality() {
        return highQuality;
    }

    public void setHighQuality(Video highQuality) {
        this.highQuality = highQuality;
    }

    public Video getLowQuality() {
        return lowQuality;
    }

    public void setLowQuality(Video lowQuality) {
        this.lowQuality = lowQuality;
    }

    public NetworkPhoto getPoster() {
        return poster;
    }

    public void setPoster(NetworkPhoto poster) {
        this.poster = poster;
    }
}