package com.yiibai.mybatis.dao;

import java.util.List;

import com.yiibai.mybatis.models.Order5;
import com.yiibai.mybatis.models.User5;

public interface UserMaper5 {
	
	public User5 getUserById(int i);
	public List<Order5> getUserOrders(int t);

}
