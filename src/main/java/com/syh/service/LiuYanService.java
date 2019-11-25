package com.syh.service;

import com.syh.bean.LiuYan;

import java.util.List;

public interface LiuYanService {
	int insert(LiuYan liuYan);
	int deleteById(Integer id);
	LiuYan selectById(Integer id);
	List<LiuYan> selectByColumn(Integer column);
	List<LiuYan> selectBySno(String sno);
	List<LiuYan> selectAll();
	//点赞
	int likeTheLiuYan(Integer lid, String sno);
	//评论
	int commentTheLiuYan(Integer lid, String comment, String sno);
	//转发
	int respostTheLiuYan(Integer lid, String sno);
	//通过学号查找喜欢的留言
	List<LiuYan> selectLikeLiuYan(String sno);
	//通过学号查找评论的留言
	List<LiuYan> selectCommentLiuYanBySno(String sno);
	//通过学号查找转发的留言
	
}
