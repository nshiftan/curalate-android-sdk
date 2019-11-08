//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.requests;

import com.curalate.android.MediaOrdering;

import java.util.List;
import java.util.Locale;

public class GetMediaRequest {

    private String dataSourceId;
    private MediaFilter filter;
    private Boolean requireProduct;
    private List<String> productMetadata;
    private Locale locale;
    private MediaOrdering sort;
    private Integer limit;
    private String after;
    private String before;

    GetMediaRequest(String dataSourceId,
                    MediaFilter filter,
                    Boolean requireProduct,
                    List<String> productMetadata,
                    Locale locale,
                    MediaOrdering sort,
                    Integer limit,
                    String after,
                    String before) {
        this.dataSourceId = dataSourceId;
        this.filter = filter;
        this.requireProduct = requireProduct;
        this.productMetadata = productMetadata;
        this.locale = locale;
        this.sort = sort;
        this.limit = limit;
        this.after = after;
        this.before = before;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public MediaFilter getFilter() { return filter; }

    public Boolean getRequireProduct() { return requireProduct; }

    public List<String> getProductMetadata() {
        return productMetadata;
    }

    public Locale getLocale() {
        return locale;
    }

    public MediaOrdering getSort() {
        return sort;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getAfter() {
        return after;
    }

    public String getBefore() {
        return before;
    }

    public static class Builder {

        private String dataSourceId;
        private MediaFilter filter;
        private Boolean requireProduct;
        private List<String> productMetadata;
        private Locale locale;
        private MediaOrdering sort;
        private Integer limit;
        private String after;
        private String before;

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setFilter(MediaFilter filter) {
            this.filter = filter;
            return this;
        }

        public Builder setRequireProduct(Boolean requireProduct) {
            this.requireProduct = requireProduct;
            return this;
        }

        public Builder setProductMetadata(List<String> productMetadata) {
            this.productMetadata = productMetadata;
            return this;
        }

        public Builder setLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public Builder setSort(MediaOrdering sort) {
            this.sort = sort;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public GetMediaRequest build() {
            return new GetMediaRequest(dataSourceId,
                                       filter,
                                       requireProduct,
                                       productMetadata,
                                       locale,
                                       sort,
                                       limit,
                                       after,
                                       before);
        }
    }
}
