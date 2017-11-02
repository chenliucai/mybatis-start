package com.yiibai.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yiibai.mybatis.models.User;

//使用注解无须xml
public interface IUser {
    @Select("select * from user where id= #{id}")
    public User getUserByID(int id);
}