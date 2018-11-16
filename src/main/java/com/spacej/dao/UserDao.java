package com.spacej.dao;

import java.util.List;

import com.spacej.model.User;

public interface UserDao {
	
	//根据用户id查询用户信息
	public User findUserById(int id)throws Exception;
	//根据用户名称模糊查询
	public List<User> findUserByName(String name)throws Exception;
	//添加用户
	public void insertUser(User user) throws Exception;
	
	public List<User> findUsersResultMap() throws Exception;

}
