//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

public class NetworkPhoto extends NetworkMedia {
    private String id;
    private Image original;
    private Image small;
    private Image medium;
    private Image large;
    private Image extraLarge;
    private Image smallSquare;
    private Image mediumSquare;
    private Image largeSquare;
    private Image extraLargeSquare;

    public MediaType getType() { return MediaType.PHOTO; }

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

    public Image getLarge() {
        return large;
    }

    public void setLarge(Image large) {
        this.large = large;
    }

    public Image getExtraLarge() {
        return extraLarge;
    }

    public void setExtraLarge(Image extraLarge) {
        this.extraLarge = extraLarge;
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

    public Image getLargeSquare() {
        return largeSquare;
    }

    public void setLargeSquare(Image largeSquare) {
        this.largeSquare = largeSquare;
    }

    public Image getExtraLargeSquare() {
        return extraLargeSquare;
    }

    public void setExtraLargeSquare(Image extraLargeSquare) {
        this.extraLargeSquare = extraLargeSquare;
    }
}
