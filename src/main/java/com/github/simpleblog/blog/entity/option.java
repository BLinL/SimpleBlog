package com.github.simpleblog.blog.entity;

import java.io.Serializable;

public class option implements Serializable {
    private String id;

    private String optioncategory;

    private String optionvalue;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOptioncategory() {
        return optioncategory;
    }

    public void setOptioncategory(String optioncategory) {
        this.optioncategory = optioncategory == null ? null : optioncategory.trim();
    }

    public String getOptionvalue() {
        return optionvalue;
    }

    public void setOptionvalue(String optionvalue) {
        this.optionvalue = optionvalue == null ? null : optionvalue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", optioncategory=").append(optioncategory);
        sb.append(", optionvalue=").append(optionvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}