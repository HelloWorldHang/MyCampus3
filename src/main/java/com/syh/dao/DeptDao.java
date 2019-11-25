package com.syh.dao;

import com.syh.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DeptDao {
	//写在xml文件中
	List<User> selectAllStuByDeptno(int deptno);
	@Insert("insert into tb_dept values(null,#{name})")
	int insertDept(String name);
	@Update("update tb_dept set name=#{name} where id=#{id}")
	int updateDept(@Param("id") Integer id, @Param("name") String name);
	@Delete("delete from tb_dept where id=#{id}")
	int deleteDeptByDeptno(Integer deptno);
}
