package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class category implements Serializable {
    private String id;

    private String categorytitle;

    private String categoryuri;

    private Integer categoryorder;

    private Integer categorytagcnt;

    private String categorydescription;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCategorytitle() {
        return categorytitle;
    }

    public void setCategorytitle(String categorytitle) {
        this.categorytitle = categorytitle == null ? null : categorytitle.trim();
    }

    public String getCategoryuri() {
        return categoryuri;
    }

    public void setCategoryuri(String categoryuri) {
        this.categoryuri = categoryuri == null ? null : categoryuri.trim();
    }

    public Integer getCategoryorder() {
        return categoryorder;
    }

    public void setCategoryorder(Integer categoryorder) {
        this.categoryorder = categoryorder;
    }

    public Integer getCategorytagcnt() {
        return categorytagcnt;
    }

    public void setCategorytagcnt(Integer categorytagcnt) {
        this.categorytagcnt = categorytagcnt;
    }

    public String getCategorydescription() {
        return categorydescription;
    }

    public void setCategorydescription(String categorydescription) {
        this.categorydescription = categorydescription == null ? null : categorydescription.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categorytitle=").append(categorytitle);
        sb.append(", categoryuri=").append(categoryuri);
        sb.append(", categoryorder=").append(categoryorder);
        sb.append(", categorytagcnt=").append(categorytagcnt);
        sb.append(", categorydescription=").append(categorydescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}