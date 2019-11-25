package com.syh.dao;


import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syh.bean.User;

public class DeptDaoTest {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
	//IOC容器创建类
	DeptDao mapper = (DeptDao)context.getBean("deptDao");
	@Test
	public void testSelectAllStuByDeptno() {
		List<User> students = mapper.selectAllStuByDeptno(1);
		for (User user : students) {
			System.out.println(user.getSno()+"   " + user.getUsername());
		}
	}
	@Test
	public void testInsertDept() {
		int res = mapper.insertDept("音乐学院");
		System.out.println(res);
	}
	@Test
	public void testUpdateDept() {
		int res = mapper.updateDept(1, "舞蹈学院");
		System.out.println(res);
	}
	@Test
	public void testDeleteDeptByDeptno() {
		int res = mapper.deleteDeptByDeptno(4);
		System.out.println(res);
	}

}
