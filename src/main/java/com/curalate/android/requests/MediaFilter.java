//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.requests;

public abstract class MediaFilter {

    abstract public String toQueryString();

     public static class CustomFilter extends MediaFilter {
        private String key;
        private String value;
        public CustomFilter(String key, String value) {
            this.key = key;
            this.value = value;
        }
        public String toQueryString() {
            return key + ":" + value;
        }
    }

    public static class ProductIdFilter extends CustomFilter {
        public ProductIdFilter(String productId) {
            super("productId", productId);
        }
    }

    public static class ProductUrlFilter extends CustomFilter {
        public ProductUrlFilter(String productUrl) {
            super("productUrl", productUrl);
        }
    }

    public static class LabelFilter extends CustomFilter {
        public LabelFilter(String label) {
            super("label", label);
        }
    }

    public static class UsernameFilter extends CustomFilter {
        public UsernameFilter(String username) {
            super("username", username);
        }
    }

    public static class CategoryFilter extends CustomFilter {
        public CategoryFilter(String category) {
            super("category", "\"" + category + "\"");
        }
    }

    public static class TagFilter extends CustomFilter {
        public TagFilter(String tag) {
            super("tag", tag);
        }
    }

    public static class And extends MediaFilter {
        private MediaFilter f1;
        private MediaFilter f2;
        public And(MediaFilter f1, MediaFilter f2) {
            this.f1 = f1;
            this.f2 = f2;
        }
        public String toQueryString() {
            return "(" + f1.toQueryString() + " and " + f2.toQueryString() + ")";
        }
    }

    public static class Or extends MediaFilter {
        private MediaFilter f1;
        private MediaFilter f2;
        public Or(MediaFilter f1, MediaFilter f2) {
            this.f1 = f1;
            this.f2 = f2;
        }
        public String toQueryString() {
            return "(" + f1.toQueryString() + " or " + f2.toQueryString() + ")";
        }
    }
}

