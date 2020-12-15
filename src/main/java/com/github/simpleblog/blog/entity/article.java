package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class article implements Serializable {
    private String id;

    private String articletitle;

    private String articleauthorid;

    private String articlepermalink;

    private String articleputtop;

    private Long articlecreated;

    private Long articleupdated;

    private Double articlerandomdouble;

    private String articlesignid;

    private String articleviewpwd;

    private String articleimg1url;

    private Integer articlestatus;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle == null ? null : articletitle.trim();
    }

    public String getArticleauthorid() {
        return articleauthorid;
    }

    public void setArticleauthorid(String articleauthorid) {
        this.articleauthorid = articleauthorid == null ? null : articleauthorid.trim();
    }

    public String getArticlepermalink() {
        return articlepermalink;
    }

    public void setArticlepermalink(String articlepermalink) {
        this.articlepermalink = articlepermalink == null ? null : articlepermalink.trim();
    }

    public String getArticleputtop() {
        return articleputtop;
    }

    public void setArticleputtop(String articleputtop) {
        this.articleputtop = articleputtop == null ? null : articleputtop.trim();
    }

    public Long getArticlecreated() {
        return articlecreated;
    }

    public void setArticlecreated(Long articlecreated) {
        this.articlecreated = articlecreated;
    }

    public Long getArticleupdated() {
        return articleupdated;
    }

    public void setArticleupdated(Long articleupdated) {
        this.articleupdated = articleupdated;
    }

    public Double getArticlerandomdouble() {
        return articlerandomdouble;
    }

    public void setArticlerandomdouble(Double articlerandomdouble) {
        this.articlerandomdouble = articlerandomdouble;
    }

    public String getArticlesignid() {
        return articlesignid;
    }

    public void setArticlesignid(String articlesignid) {
        this.articlesignid = articlesignid == null ? null : articlesignid.trim();
    }

    public String getArticleviewpwd() {
        return articleviewpwd;
    }

    public void setArticleviewpwd(String articleviewpwd) {
        this.articleviewpwd = articleviewpwd == null ? null : articleviewpwd.trim();
    }

    public String getArticleimg1url() {
        return articleimg1url;
    }

    public void setArticleimg1url(String articleimg1url) {
        this.articleimg1url = articleimg1url == null ? null : articleimg1url.trim();
    }

    public Integer getArticlestatus() {
        return articlestatus;
    }

    public void setArticlestatus(Integer articlestatus) {
        this.articlestatus = articlestatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articletitle=").append(articletitle);
        sb.append(", articleauthorid=").append(articleauthorid);
        sb.append(", articlepermalink=").append(articlepermalink);
        sb.append(", articleputtop=").append(articleputtop);
        sb.append(", articlecreated=").append(articlecreated);
        sb.append(", articleupdated=").append(articleupdated);
        sb.append(", articlerandomdouble=").append(articlerandomdouble);
        sb.append(", articlesignid=").append(articlesignid);
        sb.append(", articleviewpwd=").append(articleviewpwd);
        sb.append(", articleimg1url=").append(articleimg1url);
        sb.append(", articlestatus=").append(articlestatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}