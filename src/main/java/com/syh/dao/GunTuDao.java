package com.syh.dao;

import com.syh.bean.GunTu;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface GunTuDao {
	@Insert("insert into tb_guntu values(#{id},#{img},#{link},#{title})")
	int insert(GunTu gunTu);
	//@Param("id") Integer id,@Param("img") String img,@Param("link") String link,@Param("title") String title
	@Delete("delete from tb_guntu where id = #{id}")
	int delete(Integer id);
	@Update("update tb_guntu set img = #{img},link=#{link},title=#{title} where id = #{id}")
	int update(GunTu gunTu);
	@Select("select * from tb_guntu")
	List<GunTu> selectAll();
	@Select("select * from tb_guntu where id=#{id}")
    GunTu selectById(@Param("id") Integer id);
}
