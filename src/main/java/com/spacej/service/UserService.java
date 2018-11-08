package com.spacej.service;

import java.util.List;

import com.spacej.entity.User;

public interface UserService {
	//根据用户id查询用户信息
	public User findUserById(int id)throws Exception;
	//根据用户名称模糊查询
	public List<User> findUserByName(String name)throws Exception;
	//添加用户
	public void insertUser(User user) throws Exception;
}
