package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class articleWithBLOBs extends article implements Serializable {
    private String articleabstract;

    private String articleabstracttext;

    private String articletags;

    private String articlecontent;

    private static final long serialVersionUID = 1L;

    public String getArticleabstract() {
        return articleabstract;
    }

    public void setArticleabstract(String articleabstract) {
        this.articleabstract = articleabstract == null ? null : articleabstract.trim();
    }

    public String getArticleabstracttext() {
        return articleabstracttext;
    }

    public void setArticleabstracttext(String articleabstracttext) {
        this.articleabstracttext = articleabstracttext == null ? null : articleabstracttext.trim();
    }

    public String getArticletags() {
        return articletags;
    }

    public void setArticletags(String articletags) {
        this.articletags = articletags == null ? null : articletags.trim();
    }

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleabstract=").append(articleabstract);
        sb.append(", articleabstracttext=").append(articleabstracttext);
        sb.append(", articletags=").append(articletags);
        sb.append(", articlecontent=").append(articlecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}