package com.syh.service.impl;

import com.syh.bean.User;
import com.syh.dao.UserDao;
import com.syh.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
	private UserDao userDao;//已映射，无需实例化
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public int deleteUserBySno(String sno) {
		return userDao.deleteUserBySno(sno);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User selectUserBySno(String sno) {
		return userDao.selectUserBySno(sno);
	}

	@Override
	public User selectUserByUsername(String username) {
		return userDao.selectUserByUsername(username);
	}

	@Override
	public List<User> selectAllUser() {
		return userDao.selectAllUser();
	}

	@Override
	public User selectUserBySnoAndPassword(String sno, String password) {
		return userDao.selectUserBySnoAndPassword(sno, password);
	}

	@Override
	public List<User> selectByCondition(User user) {
		return userDao.selectByCondition(user);
	}

}
