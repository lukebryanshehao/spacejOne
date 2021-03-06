package com.spacej.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spacej.entity.User;

@Mapper
public interface UserMapper {
	
	//根据用户id查询用户信息
	public User findUserById(int id)throws Exception;
	//根据用户名称模糊查询
	public List<User> findUserByName(String name)throws Exception;
	//添加用户
	public void insertUser(User user) throws Exception;
	
	public List<User> findUsersResultMap() throws Exception;

}
