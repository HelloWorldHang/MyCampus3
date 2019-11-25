package com.syh.dao;

import com.syh.bean.LiuYan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LiuYanDao {
	@Insert("insert into tb_liuyan (sno,liuyan,col,keyword) values(#{sno},#{liuyan},#{col},#{keyword})")
	int insert(LiuYan liuYan);
	//级联操作
	@Delete("delete from tb_liuyan where id=#{id}")
	int deleteById(Integer id);
	//查询留言时没有将学生的全部信息都查出来
	//写在xml文件中
	LiuYan selectById(Integer id);
	List<LiuYan> selectByColumn(Integer column);
	List<LiuYan> selectBySno(String sno);
	List<LiuYan> selectAll();
	//
	List<LiuYan> selectByCondition(@Param("liuYan") LiuYan liuYan, @Param("username") String username);
	//点赞数量加一
	@Update("update tb_liuyan set lamount=lamount+1 where id = #{id}")
	int likeAmountAdd(Integer id);
	//评论数量加一
	@Update("update tb_liuyan set camount=camount+1 where id = #{id}")
	int commentAmountAdd(Integer id);
	//转发数量加一
	@Update("update tb_liuyan set ramount=ramount+1 where id = #{id}")
	int repostAmountAdd(Integer id);
	
}
