package com.syh.dao;


import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syh.bean.LiuYan;
import com.syh.bean.User;

public class LiuYanDaoTest {
	//加载配置文件到IOC容器
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	//IOC容器创建类
	LiuYanDao mapper = (LiuYanDao)context.getBean("liuYanDao");
	@Test
	public void testInsert() {
		LiuYan liuYan = new LiuYan();
		liuYan.setSno("201771020125");
		liuYan.setLiuyan("lalalalalalallala");
		liuYan.setCol(1);
		int res = mapper.insert(liuYan);
		System.out.println(res);
	}

	@Test
	public void testDeleteById() {
		int res = mapper.deleteById(3);
		System.out.println(res);
	}

	@Test
	public void testSelectById() {
		LiuYan liuYan = mapper.selectById(2);
		System.out.println(liuYan);
	}

	@Test
	public void testSelectByColumn() {
		List<LiuYan> liuYanList = mapper.selectByColumn(2);
		for (LiuYan liuYan : liuYanList) {
			System.out.println(liuYan.getId() + " 头像："+liuYan.getStu().getImg()+"   " +liuYan.getStu().getUsername() + "   "+liuYan.getSno() + "   " +liuYan.getLiuyan() + "   " 
		+ liuYan.getColName().getName() + "   " + liuYan.getKeyword()+"  点赞数:" + liuYan.getLamount()
		+ "  转发数：" + liuYan.getRamount() + "  评论数：" + liuYan.getCamount());
		}
	}
	@Test
	public void testSelectBySno() {
		List<LiuYan> liuYanList = mapper.selectBySno("201771020125");
		for (LiuYan liuYan : liuYanList) {
			System.out.println(liuYan.getId()+" 头像："+liuYan.getStu().getImg()+"   "+liuYan.getStu().getUsername() + "   " + liuYan.getLiuyan() + "   " 
		+ liuYan.getColName().getName() + "   " + liuYan.getKeyword()+"  点赞数:" + liuYan.getLamount()
		+ "  转发数：" + liuYan.getRamount() + "  评论数：" + liuYan.getCamount());
		}
	}

	@Test
	public void testSelectAll() {
		List<LiuYan> liuYanList = mapper.selectAll();
		for (LiuYan liuYan : liuYanList) {
			System.out.println(liuYan.getId() + " 头像："+liuYan.getStu().getImg()+"   "+liuYan.getStu().getUsername() + "   "+liuYan.getLiuyan()+"   " + liuYan.getKeyword()+"  点赞数:" + liuYan.getLamount()
			+ "  转发数：" + liuYan.getRamount() + "  评论数：" + liuYan.getCamount());
		}
	}
	@Test
	public void testLikeAmountAdd() {
		int res = mapper.likeAmountAdd(4);
		System.out.println(res);
	}
	@Test
	public void testCommentAmountAdd() {
		int res = mapper.commentAmountAdd(4);
		System.out.println(res);
	}
	@Test
	public void testRepostAmountAdd() {
		int res = mapper.repostAmountAdd(4);
		System.out.println(res);
	}
	@Test
	public void testSelectByCondition() {
		LiuYan liuYan = new LiuYan();
		liuYan.setKeyword("");
		String username = "铭";
		List<LiuYan> liuYanList = mapper.selectByCondition(liuYan,username);
		liuYanList.forEach(System.out::println);
	}

}
