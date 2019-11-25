package com.syh.dao;

import com.syh.bean.LiuYan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LikeDao {
	@Insert("insert into tb_like values(#{lid},#{sno})")
	int like(@Param("lid") Integer lid, @Param("sno") String sno);
	//写在xml中
	List<LiuYan> selectLikeLiuYan(String sno);
}
