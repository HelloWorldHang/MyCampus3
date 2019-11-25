package com.syh.service;

import com.syh.bean.User;

import java.util.List;

public interface UserService {
	int insertUser(User user);
	int deleteUserBySno(String sno);
	int updateUser(User user);
	User selectUserBySno(String sno);
	User selectUserByUsername(String username);
	List<User> selectAllUser();
	User selectUserBySnoAndPassword(String sno, String password);
	List<User> selectByCondition(User user);
}
