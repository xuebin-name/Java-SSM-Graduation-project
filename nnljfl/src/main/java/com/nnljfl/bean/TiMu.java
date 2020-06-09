package com.nnljfl.bean;

public class TiMu {
    private Integer tmId;

    private Integer typeId;

    private Integer csId;

    private Integer ctState;

    public Integer getTmId() {
        return tmId;
    }

    public void setTmId(Integer tmId) {
        this.tmId = tmId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCsId() {
        return csId;
    }

    public void setCsId(Integer csId) {
        this.csId = csId;
    }

    public Integer getCtState() {
        return ctState;
    }

    public void setCtState(Integer ctState) {
        this.ctState = ctState;
    }

	@Override
	public String toString() {
		return "TiMu [tmId=" + tmId + ", typeId=" + typeId + ", csId=" + csId + ", ctState=" + ctState + "]";
	}
    
    
}