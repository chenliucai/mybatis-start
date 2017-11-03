package com.yiibai.mybatis.models;

public class Order5 {
	private int orderId;
	private String orderNo;
	private float money;
	private int userId;
	private User5 user;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public User5 getUser() {
		return user;
	}
	public void setUser(User5 user) {
		this.user = user;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}

}
