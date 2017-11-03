package com.yiibai.mybatis.models;

import java.util.List;

public class User2 {
	private int id;
	private String username;
	private String mobile;
	private List<Post2> posts;

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

	public List<Post2> getPosts() {
		return posts;
	}
	public void setPosts(List<Post2> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + username + "]";
	}

}
