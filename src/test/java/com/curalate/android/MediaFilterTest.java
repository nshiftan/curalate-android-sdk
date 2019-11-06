//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android;

import com.curalate.android.requests.MediaFilter;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediaFilterTest {

    @Test public void productIdFilterTest() {
        MediaFilter mf = new MediaFilter.ProductIdFilter("leather-jacket");
        assertEquals(mf.toQueryString(), "productId:leather-jacket");
    }

    @Test public void productUrlFilterTest() {
        MediaFilter mf = new MediaFilter.ProductUrlFilter("https://habilimentclothing.myshopify.com/products/the-deep-v-t-shirt");
        assertEquals(mf.toQueryString(), "productUrl:https://habilimentclothing.myshopify.com/products/the-deep-v-t-shirt");
    }

    @Test public void labelFilterTest() {
        MediaFilter mf = new MediaFilter.LabelFilter("may_2016");
        assertEquals(mf.toQueryString(), "label:may_2016");
    }

    @Test public void usernameFilterTest() {
        MediaFilter mf = new MediaFilter.UsernameFilter("brandusername");
        assertEquals(mf.toQueryString(), "username:brandusername");
    }

    @Test public void categoryFilterTest() {
        MediaFilter mf = new MediaFilter.CategoryFilter("Women’s > Footwear > Boots");
        assertEquals(mf.toQueryString(), "category:\"Women’s > Footwear > Boots\"");
    }

    @Test public void tagFilterTest() {
        MediaFilter mf = new MediaFilter.TagFilter("myhashtag");
        assertEquals(mf.toQueryString(), "tag:myhashtag");
    }

    @Test public void customFilterTest() {
        MediaFilter mf = new MediaFilter.CustomFilter("manufacturer", "acmeltd");
        assertEquals(mf.toQueryString(), "manufacturer:acmeltd");
    }

    @Test public void simpleAndFilterTest() {
        MediaFilter mf1 = new MediaFilter.ProductIdFilter("leather-jacket");
        MediaFilter mf2 = new MediaFilter.CustomFilter("gem_stone", "diamond");
        MediaFilter and = new MediaFilter.And(mf1, mf2);
        assertEquals(and.toQueryString(), "(productId:leather-jacket and gem_stone:diamond)");
    }

}
