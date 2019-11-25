package com.syh.dao;


import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syh.bean.LiuYan;

public class CommentDaoTest {
	//加载配置文件到IOC容器
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
	//IOC容器创建类
	CommentDao mapper = (CommentDao)context.getBean("commentDao");
	@Test
	public void testInsertComment() {
		int res = mapper.insertComment(7, "啊啊啊", "201771020122");
		System.out.println(res);
	}

	@Test
	public void testSelectCommentLiuYanBySno() {
		List<LiuYan> liuYanList = mapper.selectCommentLiuYanBySno("201771020122");
		for (LiuYan liuYan : liuYanList) {
			System.out.println(liuYan.getId()+" 头像："+liuYan.getStu().getImg()+"   "+liuYan.getStu().getUsername() + "   " + liuYan.getLiuyan() + "   " 
		+ liuYan.getColName().getName() + "   " + liuYan.getKeyword()+"  点赞数:" + liuYan.getLamount()
		+ "  转发数：" + liuYan.getRamount() + "  评论数：" + liuYan.getCamount());
		}
	}

}
