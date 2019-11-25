package com.syh.dao;


import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.syh.bean.LiuYan;

public class LikeDaoTest {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
	//IOC容器创建类
	LikeDao mapper = (LikeDao)context.getBean("likeDao");
	@Test
	public void testLike() {
		int res = mapper.like(2, "201771020122");
		System.out.println(res);
	}

	@Test
	public void testSelectLikeLiuYan() {
		List<LiuYan> liuYanList = mapper.selectLikeLiuYan("201771020122");
		for (LiuYan liuYan : liuYanList) {
			System.out.println(liuYan.getId()+" 头像："+liuYan.getStu().getImg()+"   "+liuYan.getStu().getUsername() + "   " + liuYan.getLiuyan() + "   " 
		+ liuYan.getColName().getName() + "   " + liuYan.getKeyword()+"  点赞数:" + liuYan.getLamount()
		+ "  转发数：" + liuYan.getRamount() + "  评论数：" + liuYan.getCamount());
		}
	}

}
