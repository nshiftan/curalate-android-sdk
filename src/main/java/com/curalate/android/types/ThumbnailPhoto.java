//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

public class ThumbnailPhoto {
    private Image original;
    private Image small;
    private Image medium;
    private Image smallSquare;
    private Image mediumSquare;

    public Image getOriginal() {
        return original;
    }

    public void setOriginal(Image original) {
        this.original = original;
    }

    public Image getSmall() {
        return small;
    }

    public void setSmall(Image small) {
        this.small = small;
    }

    public Image getMedium() {
        return medium;
    }

    public void setMedium(Image medium) {
        this.medium = medium;
    }

    public Image getSmallSquare() {
        return smallSquare;
    }

    public void setSmallSquare(Image smallSquare) {
        this.smallSquare = smallSquare;
    }

    public Image getMediumSquare() {
        return mediumSquare;
    }

    public void setMediumSquare(Image mediumSquare) {
        this.mediumSquare = mediumSquare;
    }
}