package com.syh.bean;

public class Comment {
	private Integer lid;
	private String sno;
	private String comment;
	private User stu;//查询留言时能获取到评论内容及评论人的相关信息，toString方法只写了lid、comment、sno、sname
	
	public Comment(Integer lid, String sno, String comment) {
		super();
		this.lid = lid;
		this.sno = sno;
		this.comment = comment;
	}
	public Comment() {
		super();
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Comment [lid=" + lid + ", comment=" + comment + ",\n stu=" + stu.getSno() +"sname=" + stu.getUsername()+ "]";
	}
	
	
}
