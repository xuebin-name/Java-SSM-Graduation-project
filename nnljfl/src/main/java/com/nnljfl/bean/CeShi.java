package com.nnljfl.bean;

public class CeShi {
    private Integer csId;

    private String csText;

    private Integer typeId;

    public Integer getCsId() {
        return csId;
    }

    public void setCsId(Integer csId) {
        this.csId = csId;
    }

    public String getCsText() {
        return csText;
    }

    public void setCsText(String csText) {
        this.csText = csText == null ? null : csText.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}