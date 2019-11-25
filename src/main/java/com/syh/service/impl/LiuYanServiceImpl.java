package com.syh.service.impl;

import com.syh.bean.LiuYan;
import com.syh.dao.CommentDao;
import com.syh.dao.LikeDao;
import com.syh.dao.LiuYanDao;
import com.syh.service.LiuYanService;

import java.util.List;

public class LiuYanServiceImpl implements LiuYanService {
	private LiuYanDao liuYanDao;//这些属性均由IOC容器实例化
	private LikeDao likeDao;  //若不在<bean>标签中配置某个属性则进行调用时将会出现空指针异常
	private CommentDao commentDao;
	
	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	public LiuYanDao getLiuYanDao() {
		return liuYanDao;
	}

	public void setLiuYanDao(LiuYanDao liuYanDao) {
		this.liuYanDao = liuYanDao;
	}

	public LikeDao getLikeDao() {
		return likeDao;
	}

	public void setLikeDao(LikeDao likeDao) {
		this.likeDao = likeDao;
	}

	@Override
	public int insert(LiuYan liuYan) {
		return liuYanDao.insert(liuYan);
	}

	@Override
	public int deleteById(Integer id) {
		return liuYanDao.deleteById(id);
	}

	@Override
	public LiuYan selectById(Integer id) {
		return liuYanDao.selectById(id);
	}

	@Override
	public List<LiuYan> selectByColumn(Integer column) {
		return liuYanDao.selectByColumn(column);
	}

	@Override
	public List<LiuYan> selectBySno(String sno) {
		return liuYanDao.selectBySno(sno);
	}

	@Override
	public List<LiuYan> selectAll() {
		return liuYanDao.selectAll();
	}

	@Override
	public int likeTheLiuYan(Integer lid, String sno) {
		int res = likeDao.like(lid, sno);
		liuYanDao.likeAmountAdd(lid);
		return res;
	}

	@Override
	public int commentTheLiuYan(Integer lid, String comment, String sno) {
		int res = liuYanDao.commentAmountAdd(lid);
		commentDao.insertComment(lid, comment, sno);
		return res;
	}

	@Override
	public int respostTheLiuYan(Integer lid, String sno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<LiuYan> selectLikeLiuYan(String sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LiuYan> selectCommentLiuYanBySno(String sno) {
		// TODO Auto-generated method stub
		return null;
	}

}
