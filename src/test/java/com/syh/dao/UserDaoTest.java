package com.syh.dao;


import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syh.bean.User;
public class UserDaoTest {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	//IOC容器创建类
	UserDao mapper = (UserDao)context.getBean("userDao");
	@Test
	public void testInsertUser() {
		User user = new User();
		user.setSno("201871020458");
		user.setUsername("pp");
		user.setPassword("password");
		user.setGender((byte) 0);
		user.setImg("img");
		user.setDeptno(4);
		int res = mapper.insertUser(user);
		System.out.println(res);
	}

	@Test
	public void testUpdateUser() {
		User user = new User();
		user.setDeptno(1);
		user.setSno("201771020126");
		int res = mapper.updateUser(user);
		System.out.println(res);
	}

	@Test
	public void testDeleteUserBySno() {
		int res = mapper.deleteUserBySno("201771020126");
		System.out.println(res);
	}

	@Test
	public void testSelectUserBySno() {
		User user = mapper.selectUserBySno("1");
		System.out.println(user);
	}
	
	@Test
	public void testSelectUserByUsername() {
		//System.out.println("aaaaaaaaaaaaaaaaaa");
		User user = mapper.selectUserByUsername("张三");
		System.out.println(user);
	}

	@Test
	public void testSelectAllUser() {
		List<User> userList = mapper.selectAllUser();
		userList.forEach(System.out::println);
	}

	@Test
	public void testSelectUserBySnoAndPassword() {
		String sno = "1";
		String password = "1";
		User user = mapper.selectUserBySnoAndPassword(sno, password);
		System.out.println(user);
	}

	@Test
	public void testSelectByCondition() {
		User user = new User();
		user.setUsername("司");
		List<User> userList = mapper.selectByCondition(user);
		System.out.println("kk");
		userList.forEach(System.out::println);
	}

}
