package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class user implements Serializable {
    private String id;

    private String username;

    private String userurl;

    private String userrole;

    private String useravatar;

    private String userb3key;

    private String usergithubid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserurl() {
        return userurl;
    }

    public void setUserurl(String userurl) {
        this.userurl = userurl == null ? null : userurl.trim();
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole == null ? null : userrole.trim();
    }

    public String getUseravatar() {
        return useravatar;
    }

    public void setUseravatar(String useravatar) {
        this.useravatar = useravatar == null ? null : useravatar.trim();
    }

    public String getUserb3key() {
        return userb3key;
    }

    public void setUserb3key(String userb3key) {
        this.userb3key = userb3key == null ? null : userb3key.trim();
    }

    public String getUsergithubid() {
        return usergithubid;
    }

    public void setUsergithubid(String usergithubid) {
        this.usergithubid = usergithubid == null ? null : usergithubid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", userurl=").append(userurl);
        sb.append(", userrole=").append(userrole);
        sb.append(", useravatar=").append(useravatar);
        sb.append(", userb3key=").append(userb3key);
        sb.append(", usergithubid=").append(usergithubid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}