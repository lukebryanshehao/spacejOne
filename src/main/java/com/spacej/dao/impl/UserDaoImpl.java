package com.spacej.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.spacej.dao.UserDao;
import com.spacej.model.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	//由于继承SqlSessionDaoSupport所以这里不用再添加setSqlSessionFacotry方法了。
	
	@Override
	public User findUserById(int id) throws Exception {

		// Sqlsession定义为局部变量
		SqlSession sqlSession = this.getSqlSession();

		User user = sqlSession.selectOne("com.spacej.dao.UserDao.findUserById", id);

    	return user;
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {

		// Sqlsession定义为局部变量
		SqlSession sqlSession = this.getSqlSession();
		List<User> list = sqlSession.selectList("com.spacej.dao.UserDao.findUserByName", "张");

		return list;
	}

	@Override
	public void insertUser(User user) throws Exception {
		// Sqlsession定义为局部变量
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.insert("com.spacej.dao.UserDao.insertUser", user);
	}

	@Override
	public List<User> findUsersResultMap() throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		List<User> list = sqlSession.selectList("com.spacej.dao.UserDao.findUsersResultMap");

		return list;
	}

}
