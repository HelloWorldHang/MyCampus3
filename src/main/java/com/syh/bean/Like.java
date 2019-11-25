package com.syh.bean;

public class Like {
	private Integer lid;
	private String sno;
	private User stu;//查询留言时能获取到点赞人的相关信息，toString方法只写了lid、sno、sname
	
	public Like() {
		super();
	}
	public Like(Integer lid, String sno) {
		super();
		this.lid = lid;
		this.sno = sno;
	}
	public User getStu() {
		return stu;
	}
	public void setStu(User stu) {
		this.stu = stu;
	}
	
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	@Override
	public String toString() {
		return "Like [lid=" + lid +",\n stu=" + stu.getSno() +"sname=" + stu.getUsername()+ "]";
	}
	
	
	
}
