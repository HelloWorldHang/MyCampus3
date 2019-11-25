package com.syh.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface RepostDao {
	@Insert("insert into tb_repost values(#{lid},#{sno})")
	int insertRespost(@Param("lid") Integer lid, @Param("sno") String sno);
}
