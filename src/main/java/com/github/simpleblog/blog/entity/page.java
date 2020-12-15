package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class page implements Serializable {
    private String id;

    private Integer pageorder;

    private String pagepermalink;

    private String pagetitle;

    private String pageopentarget;

    private String pageicon;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getPageorder() {
        return pageorder;
    }

    public void setPageorder(Integer pageorder) {
        this.pageorder = pageorder;
    }

    public String getPagepermalink() {
        return pagepermalink;
    }

    public void setPagepermalink(String pagepermalink) {
        this.pagepermalink = pagepermalink == null ? null : pagepermalink.trim();
    }

    public String getPagetitle() {
        return pagetitle;
    }

    public void setPagetitle(String pagetitle) {
        this.pagetitle = pagetitle == null ? null : pagetitle.trim();
    }

    public String getPageopentarget() {
        return pageopentarget;
    }

    public void setPageopentarget(String pageopentarget) {
        this.pageopentarget = pageopentarget == null ? null : pageopentarget.trim();
    }

    public String getPageicon() {
        return pageicon;
    }

    public void setPageicon(String pageicon) {
        this.pageicon = pageicon == null ? null : pageicon.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pageorder=").append(pageorder);
        sb.append(", pagepermalink=").append(pagepermalink);
        sb.append(", pagetitle=").append(pagetitle);
        sb.append(", pageopentarget=").append(pageopentarget);
        sb.append(", pageicon=").append(pageicon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}