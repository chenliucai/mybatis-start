package com.yiibai.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yiibai.mybatis.models.User;
import com.yiibai.mybatis.models.User1;

//使用注解无须xml
public interface IUser1 {
    //@Select("select * from user where id= #{id}")
    //public User getUserByID(int id);


	public List<User1> getUserList();

    public void insertUser(User1 user);

    public void updateUser(User1 user);

    public void deleteUser(int userId);

    public User1 getUser(int id);
}