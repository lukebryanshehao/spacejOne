package com.spacej.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.spacej.dao.UserDao;
import com.spacej.entity.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	//由于继承SqlSessionDaoSupport所以这里不用再添加setSqlSessionFacotry方法了。
	
	@Override
	public User findUserById(int id) throws Exception {

		// Sqlsession定义为局部变量
		SqlSession sqlSession = this.getSqlSession();

		User user = sqlSession.selectOne("test.findUserById", id);

    	return user;
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {

		// Sqlsession定义为局部变量
		SqlSession sqlSession = this.getSqlSession();
		List<User> list = sqlSession.selectList("test.findUserByName", "张");

		return list;
	}

	@Override
	public void insertUser(User user) throws Exception {
		// Sqlsession定义为局部变量
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.insert("test.insertUser", user);
	}

}
