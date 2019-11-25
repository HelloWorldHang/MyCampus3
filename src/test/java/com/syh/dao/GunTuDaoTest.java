package com.syh.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syh.bean.GunTu;

public class GunTuDaoTest {
	//加载配置文件到IOC容器
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
	//IOC容器创建类
	GunTuDao gunTuDao = (GunTuDao)context.getBean("gunTuDao");
	
	@Test
	public void testInsert() {
		GunTu gunTu = new GunTu();
		gunTu.setId(4);
		gunTu.setImg("img");
		gunTu.setLink("link");
		int res = gunTuDao.insert(gunTu);
		System.out.println(res);
	}

	@Test
	public void testDelete() {
		int res = gunTuDao.delete(1);
		System.out.println(res);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}
	@Test
	public void testSelectAll() {
		List<GunTu> list = gunTuDao.selectAll();
		list.forEach(System.out::println);
	}
	@Test
	public void testSelectById() {
		GunTu gunTu = gunTuDao.selectById(1);
		System.out.println(gunTu);
	}

}
