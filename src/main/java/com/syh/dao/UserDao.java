package com.syh.dao;

import com.syh.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
	@Insert("insert into tb_user values(#{sno},#{username},#{password},#{gender},#{img},#{type},#{deptno})")
	int insertUser(User user);
	@Update("update tb_user set username=#{username},password=#{password},gender=#{gender},img=#{img},deptno=#{deptno} where sno=#{sno}")
	int updateUser(User user);
	@Delete("delete from tb_user where sno=#{sno}")
	int deleteUserBySno(String sno);
	//以下sql语句写在xml文件中
	User selectUserBySno(String sno);
	User selectUserByUsername(String username);
	List<User> selectAllUser();
	User selectUserBySnoAndPassword(@Param("sno") String sno, @Param("password") String password);
	List<User> selectByCondition(User user);
}
