//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

import java.util.List;
import java.util.Map;

public class ProductDetails {
    private String id;
    private String name;
    private List<NetworkPhoto> images;
    private Price price;
    private String link;
    private Map<String, String> metadata;
    private SpatialTag spatialTag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NetworkPhoto> getImages() {
        return images;
    }

    public void setImages(List<NetworkPhoto> images) {
        this.images = images;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public SpatialTag getSpatialTag() {
        return spatialTag;
    }

    public void setSpatialTag(SpatialTag spatialTag) {
        this.spatialTag = spatialTag;
    }
}
