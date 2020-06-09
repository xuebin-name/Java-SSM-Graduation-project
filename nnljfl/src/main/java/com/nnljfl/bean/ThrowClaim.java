package com.nnljfl.bean;

public class ThrowClaim {
    private Integer throwId;

    private Integer typeId;

    private String throwTitle;

    private String throwDatils;

    private String throwPrompt;

    public Integer getThrowId() {
        return throwId;
    }

    public void setThrowId(Integer throwId) {
        this.throwId = throwId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getThrowTitle() {
        return throwTitle;
    }

    public void setThrowTitle(String throwTitle) {
        this.throwTitle = throwTitle == null ? null : throwTitle.trim();
    }

    public String getThrowDatils() {
        return throwDatils;
    }

    public void setThrowDatils(String throwDatils) {
        this.throwDatils = throwDatils == null ? null : throwDatils.trim();
    }

    public String getThrowPrompt() {
        return throwPrompt;
    }

    public void setThrowPrompt(String throwPrompt) {
        this.throwPrompt = throwPrompt == null ? null : throwPrompt.trim();
    }

	@Override
	public String toString() {
		return "ThrowClaim [throwId=" + throwId + ", typeId=" + typeId + ", throwTitle=" + throwTitle + ", throwDatils="
				+ throwDatils + ", throwPrompt=" + throwPrompt + "]";
	}
    
    
}