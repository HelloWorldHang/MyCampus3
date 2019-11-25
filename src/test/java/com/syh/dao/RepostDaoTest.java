package com.syh.dao;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RepostDaoTest {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	//IOC容器创建类
	RepostDao mapper = (RepostDao)context.getBean("repostDao");
	@Test
	public void testInsertRespost() {
		int res = mapper.insertRespost(2, "201771020122");
		System.out.println(res);
	}

}
