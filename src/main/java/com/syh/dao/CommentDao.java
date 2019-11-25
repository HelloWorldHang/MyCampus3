package com.syh.dao;

import com.syh.bean.LiuYan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
	@Insert("insert into tb_comment values(#{lid},#{sno},#{comment})")
	int insertComment(@Param("lid") Integer lid, @Param("comment") String comment, @Param("sno") String sno);
	List<LiuYan> selectCommentLiuYanBySno(String sno);
}
