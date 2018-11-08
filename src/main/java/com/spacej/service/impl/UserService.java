package com.spacej.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spacej.dao.UserDao;
import com.spacej.entity.User;

@Service
@Transactional
public class UserService implements com.spacej.service.UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User findUserById(int id) throws Exception {
		return userDao.findUserById(id);
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {
		return userDao.findUserByName(name);
	}

	@Override
	public void insertUser(User user) throws Exception {
		userDao.insertUser(user);
	}

}
