package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class link implements Serializable {
    private String id;

    private String linkaddress;

    private String linkdescription;

    private Integer linkorder;

    private String linktitle;

    private String linkicon;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLinkaddress() {
        return linkaddress;
    }

    public void setLinkaddress(String linkaddress) {
        this.linkaddress = linkaddress == null ? null : linkaddress.trim();
    }

    public String getLinkdescription() {
        return linkdescription;
    }

    public void setLinkdescription(String linkdescription) {
        this.linkdescription = linkdescription == null ? null : linkdescription.trim();
    }

    public Integer getLinkorder() {
        return linkorder;
    }

    public void setLinkorder(Integer linkorder) {
        this.linkorder = linkorder;
    }

    public String getLinktitle() {
        return linktitle;
    }

    public void setLinktitle(String linktitle) {
        this.linktitle = linktitle == null ? null : linktitle.trim();
    }

    public String getLinkicon() {
        return linkicon;
    }

    public void setLinkicon(String linkicon) {
        this.linkicon = linkicon == null ? null : linkicon.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", linkaddress=").append(linkaddress);
        sb.append(", linkdescription=").append(linkdescription);
        sb.append(", linkorder=").append(linkorder);
        sb.append(", linktitle=").append(linktitle);
        sb.append(", linkicon=").append(linkicon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}