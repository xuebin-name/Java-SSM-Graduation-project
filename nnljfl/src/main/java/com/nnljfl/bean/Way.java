package com.nnljfl.bean;

public class Way {
    private Integer wayId;

    private Integer typeId;

    private String wayDatils;

    private String wayTitle;

    private String wayK1;

    private String wayK2;

    public Integer getWayId() {
        return wayId;
    }

    public void setWayId(Integer wayId) {
        this.wayId = wayId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getWayDatils() {
        return wayDatils;
    }

    public void setWayDatils(String wayDatils) {
        this.wayDatils = wayDatils == null ? null : wayDatils.trim();
    }

    public String getWayTitle() {
        return wayTitle;
    }

    public void setWayTitle(String wayTitle) {
        this.wayTitle = wayTitle == null ? null : wayTitle.trim();
    }

    public String getWayK1() {
        return wayK1;
    }

    public void setWayK1(String wayK1) {
        this.wayK1 = wayK1 == null ? null : wayK1.trim();
    }

    public String getWayK2() {
        return wayK2;
    }

    public void setWayK2(String wayK2) {
        this.wayK2 = wayK2 == null ? null : wayK2.trim();
    }

	@Override
	public String toString() {
		return "Way [wayId=" + wayId + ", typeId=" + typeId + ", wayDatils=" + wayDatils + ", wayTitle=" + wayTitle
				+ ", wayK1=" + wayK1 + ", wayK2=" + wayK2 + "]";
	}
    
    
}