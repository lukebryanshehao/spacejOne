package com.spacej.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spacej.dao.UserMapper;
import com.spacej.entity.User;

@Service
public class UserServiceImpl implements com.spacej.service.UserService {

	@Autowired
	private UserMapper userDao;
	
	@Override
	public User findUserById(int id) throws Exception {
		return userDao.findUserById(id);
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {
		return userDao.findUserByName(name);
	}

	@Transactional
	@Override
	public void insertUser(User user) throws Exception {
		userDao.insertUser(user);
//		user.setUsername("111");
//		userDao.insertUser(user);
	}

	@Override
	public List<User> findUsersResultMap() throws Exception {
		return userDao.findUsersResultMap();
	}

}
