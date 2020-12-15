package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class archivedate implements Serializable {
    private String id;

    private Long archivetime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getArchivetime() {
        return archivetime;
    }

    public void setArchivetime(Long archivetime) {
        this.archivetime = archivetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", archivetime=").append(archivetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}