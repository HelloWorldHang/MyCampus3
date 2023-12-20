package com.syh.bean;

import java.util.List;

public class Dept {
	private Integer id;
	private String name;
	private List<User> stu;

	public void init() {
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
	}
	
	public Dept() {
		super();
	}
	public Dept(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public List<User> getStu() {
		return stu;
	}
	public void setStu(List<User> stu) {
		this.stu = stu;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", stu=" + stu + "]";
	}
	
	
}
