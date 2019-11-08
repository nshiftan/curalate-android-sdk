//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android.types;

public class MediaSource {
    private String type;
    private Long postedTimestamp;
    private NetworkUser user;
    private String link;
    private String caption;
    private Long commentCount;
    private Long likeCount;
    private Long repinCount;
    // private LocationDetails location;
    private String sourceId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPostedTimestamp() {
        return postedTimestamp;
    }

    public void setPostedTimestamp(Long postedTimestamp) {
        this.postedTimestamp = postedTimestamp;
    }

    public NetworkUser getUser() {
        return user;
    }

    public void setUser(NetworkUser user) {
        this.user = user;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public Long getRepinCount() {
        return repinCount;
    }

    public void setRepinCount(Long repinCount) {
        this.repinCount = repinCount;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}
