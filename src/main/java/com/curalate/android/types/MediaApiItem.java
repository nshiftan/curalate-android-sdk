//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

import java.util.List;

public class MediaApiItem {
    private String id;
    private MediaSource source;
    private NetworkMedia media;
    private List<ProductDetails> products;
    private List<String> labels;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MediaSource getSource() { return source; }

    public void setSource(MediaSource source) {
        this.source = source;
    }

    public NetworkMedia getMedia() {
        return media;
    }

    public void setMedia(NetworkMedia media) {
        this.media = media;
    }

    public List<ProductDetails> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDetails> products) {
        this.products = products;
    }

    public List<String> getLabels() { return labels; }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
