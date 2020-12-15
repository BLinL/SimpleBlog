package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class pluginWithBLOBs extends plugin implements Serializable {
    private String author;

    private String setting;

    private static final long serialVersionUID = 1L;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting == null ? null : setting.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", author=").append(author);
        sb.append(", setting=").append(setting);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}