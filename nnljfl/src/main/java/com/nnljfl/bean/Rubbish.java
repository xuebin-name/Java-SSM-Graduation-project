package com.nnljfl.bean;

public class Rubbish {
    private Integer rubbishId;

    private String rubbishName;

    private String rubbishTitle;

    private Integer typeId;

    private TypeModel typeModel;
    
    
    
    public TypeModel getTypeModel() {
		return typeModel;
	}

	public void setTypeModel(TypeModel typeModel) {
		this.typeModel = typeModel;
	}

	public Integer getRubbishId() {
        return rubbishId;
    }

    public void setRubbishId(Integer rubbishId) {
        this.rubbishId = rubbishId;
    }

    public String getRubbishName() {
        return rubbishName;
    }

    public void setRubbishName(String rubbishName) {
        this.rubbishName = rubbishName == null ? null : rubbishName.trim();
    }

    public String getRubbishTitle() {
        return rubbishTitle;
    }

    public void setRubbishTitle(String rubbishTitle) {
        this.rubbishTitle = rubbishTitle == null ? null : rubbishTitle.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

	@Override
	public String toString() {
		return "Rubbish [rubbishId=" + rubbishId + ", rubbishName=" + rubbishName + ", rubbishTitle=" + rubbishTitle
				+ ", typeId=" + typeId + ", typeModel=" + typeModel + ", getTypeModel()=" + getTypeModel()
				+ ", getRubbishId()=" + getRubbishId() + ", getRubbishName()=" + getRubbishName()
				+ ", getRubbishTitle()=" + getRubbishTitle() + ", getTypeId()=" + getTypeId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
}