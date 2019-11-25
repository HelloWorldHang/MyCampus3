package com.syh.service.impl;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syh.bean.LiuYan;
import com.syh.service.LiuYanService;

public class LiuYanServiceImplTest {
	//加载配置文件到IOC容器
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
	//IOC容器创建类
	LiuYanService liuYanService = (LiuYanService)context.getBean("liuYanServiceImpl");
	@Test
	public void testInsert() {
		LiuYan liuYan = new LiuYan();
		liuYan.setSno("201778920126");
		liuYan.setLiuyan("hahahaha");
		int res = liuYanService.insert(liuYan);
		System.out.println(res);
	}

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByColumn() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectBySno() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testLikeTheLiuYan() {
		int res = liuYanService.likeTheLiuYan(5, "201778920126");
		System.out.println(res);
	}

	@Test
	public void testCommentTheLiuYan() {
		int res = liuYanService.commentTheLiuYan(7, "啊啊啊", "201771020122");
		System.out.println(res);
	}

	@Test
	public void testRespostTheLiuYan() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectLikeLiuYan() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCommentLiuYanBySno() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
