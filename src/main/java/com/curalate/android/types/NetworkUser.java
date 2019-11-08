//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

import java.math.BigDecimal;

public class NetworkUser {
    private String username;
    private String displayName;
    private String link;
    private ThumbnailPhoto image;
    private Long followerCount;
    private Long followingCount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ThumbnailPhoto getImage() {
        return image;
    }

    public void setImage(ThumbnailPhoto image) {
        this.image = image;
    }

    public Long getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Long followerCount) {
        this.followerCount = followerCount;
    }

    public Long getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Long followingCount) {
        this.followingCount = followingCount;
    }
}
