package com.syh.bean;

import org.springframework.web.multipart.MultipartFile;

public class User {
	private String sno;
	private String username;
	private String password;
	private byte gender;
	private String img;
	private Integer type;
	private Dept dept;//方便输出时使用，注册用户时不能为其赋值
	private Integer deptno;
	private MultipartFile file;
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public User() {
		super();
	}
	public User(String sno) {
		super();
		this.sno = sno;
	}
	
	public User(String username, String password, byte gender, String img, Integer type, Dept dept, Integer deptno) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.img = img;
		this.type = type;
		this.dept = dept;
		this.deptno = deptno;
	}
	public User(String sno, String username, String password, byte gender, String img, Integer type, Dept dept,
			Integer deptno) {
		super();
		this.sno = sno;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.img = img;
		this.type = type;
		this.dept = dept;
		this.deptno = deptno;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "User [sno=" + sno + ", username=" + username + ",gender=" + gender +",img=" +img +", type=" + type + ", deptName="
				 +dept.getName()+ "]";
	}
	
		
}
