package com.nnljfl.bean;

import java.util.Date;

public class Goods {
    private Integer orderId;

    private String userName;

    private String userPhone;

    private Date date;

    private String userAddress;

    private Integer rubbisStuts;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Integer getRubbisStuts() {
        return rubbisStuts;
    }

    public void setRubbisStuts(Integer rubbisStuts) {
        this.rubbisStuts = rubbisStuts;
    }

	@Override
	public String toString() {
		return "Goods [orderId=" + orderId + ", userName=" + userName + ", userPhone=" + userPhone + ", date=" + date
				+ ", userAddress=" + userAddress + ", rubbisStuts=" + rubbisStuts + "]";
	}
    
    
}