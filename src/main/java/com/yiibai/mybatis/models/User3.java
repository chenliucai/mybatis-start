package com.yiibai.mybatis.models;

import java.util.List;

public class User3 {

	
	private int id;
	private String username;
	private String mobile;
	private List<Post3> posts;

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

	public List<Post3> getPosts() {
		return posts;
	}
	public void setPosts(List<Post3> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + username + "]";
	}
}
