package com.nnljfl.bean;

public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private String adminPhone;

    private Integer adminSex;

    private Integer adminAge;

    private String adminAddress;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public Integer getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(Integer adminSex) {
        this.adminSex = adminSex;
    }

    public Integer getAdminAge() {
        return adminAge;
    }

    public void setAdminAge(Integer adminAge) {
        this.adminAge = adminAge;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress == null ? null : adminAddress.trim();
    }

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", adminPhone=" + adminPhone + ", adminSex=" + adminSex + ", adminAge=" + adminAge + ", adminAddress="
				+ adminAddress + "]";
	}
    
}