package com.syh.service.impl;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syh.bean.User;
import com.syh.service.UserService;

public class UserServiceImplTest {
	//加载配置文件到IOC容器
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
	//IOC容器创建类
	UserService userService =  (UserServiceImpl) context.getBean("userServiceImpl");//通过id
	User user =  (User) context.getBean("user");//通过id
	@Test
	public void testInsertUser() {
		user.setDeptno(1);
		user.setSno("201778920126");
		user.setGender((byte)0);
		user.setUsername("王二狗");
		int res = userService.insertUser(user);
		System.out.println(res);
	}

	@Test
	public void testDeleteUserBySno() {
	}

	@Test
	public void testUpdateUser() {
	}

	@Test
	public void testSelectUserBySno() {
	}

	@Test
	public void testSelectUserByUsername() {
	}

	@Test
	public void testSelectAllUser() {
	}

	@Test
	public void testSelectUserBySnoAndPasword() {
	}

	@Test
	public void testSelectByCondition() {
	}

}
