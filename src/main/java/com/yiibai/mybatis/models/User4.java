package com.yiibai.mybatis.models;

import java.util.List;

public class User4 {
	private int id;
	private String username;
	private String mobile;
	private List<Group4> groups;
	public List<Group4> getGroups() {
		return groups;
	}
	public void setGroups(List<Group4> groups) {
		this.groups = groups;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
