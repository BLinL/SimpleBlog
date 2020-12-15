package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class tag implements Serializable {
    private String id;

    private String tagtitle;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTagtitle() {
        return tagtitle;
    }

    public void setTagtitle(String tagtitle) {
        this.tagtitle = tagtitle == null ? null : tagtitle.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tagtitle=").append(tagtitle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}