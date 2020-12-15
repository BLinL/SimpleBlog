package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class archivedateArticle implements Serializable {
    private String id;

    private String archivedateId;

    private String articleId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getArchivedateId() {
        return archivedateId;
    }

    public void setArchivedateId(String archivedateId) {
        this.archivedateId = archivedateId == null ? null : archivedateId.trim();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", archivedateId=").append(archivedateId);
        sb.append(", articleId=").append(articleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}