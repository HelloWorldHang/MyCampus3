package com.syh.bean;

import java.util.List;
import java.util.Set;

/**
 * @author 司云航
 * 该类基本实现了对其他所有类的关联
 * 事实证明我把数据库设计到BCNF是多么错误的决定，给后续的关联查询带来了相当大的困难
 * 心得体会：对于一个对象需要经常用到的属性一定要设计到自己的表中，能带来很大的便利性 
 *
 */
public class LiuYan {
	private Integer id;
	private String sno;
	private String liuyan;//留言内容
	private Integer col;//留言栏位
	private Integer lamount;//点赞数量
	private Integer ramount;//转发数量
	private Integer camount;//评论数量
	private String keyword;
	//关联查询时需要将其他表中的信息传给以下属性
	//并没有直接将点赞、转发、评论人的信息关联起来，通过其他类再一次实现了关联
	private Set<Like> likes;//一对多，所以用集合
	private List<Repost> reposts;
	private List<Comment> comments;
	private Column colName;
	//获取留言人的头像及姓名
	private User stu;
	
	public LiuYan() {
		super();
	}
	public LiuYan(Integer id) {
		super();
		this.id = id;
	}
	public LiuYan(String sno, String liuyan, Integer col, Integer lamount, Integer ramount, Integer camount,
			String keyword) {
		super();
		this.sno = sno;
		this.liuyan = liuyan;
		this.col = col;
		this.lamount = lamount;
		this.ramount = ramount;
		this.camount = camount;
		this.keyword = keyword;
	}
	public LiuYan(Integer id, String sno, String liuyan, Integer col, Integer lamount, Integer ramount,
			Integer camount, String keyword) {
		super();
		this.id = id;
		this.sno = sno;
		this.liuyan = liuyan;
		this.col = col;
		this.lamount = lamount;
		this.ramount = ramount;
		this.camount = camount;
		this.keyword = keyword;
	}
	
	public User getStu() {
		return stu;
	}
	public void setStu(User stu) {
		this.stu = stu;
	}
	public Column getColName() {
		return colName;
	}
	public void setColName(Column colName) {
		this.colName = colName;
	}
	public Set<Like> getLikes() {
		return likes;
	}
	public void setLikes(Set<Like> likes) {
		this.likes = likes;
	}
	public List<Repost> getReposts() {
		return reposts;
	}
	public void setReposts(List<Repost> reposts) {
		this.reposts = reposts;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getLiuyan() {
		return liuyan;
	}
	public void setLiuyan(String liuyan) {
		this.liuyan = liuyan;
	}
	public Integer getCol() {
		return col;
	}
	public void setCol(Integer col) {
		this.col = col;
	}
	public Integer getLamount() {
		return lamount;
	}
	public void setLamount(Integer lamount) {
		this.lamount = lamount;
	}
	public Integer getRamount() {
		return ramount;
	}
	public void setRamount(Integer ramount) {
		this.ramount = ramount;
	}
	public Integer getCamount() {
		return camount;
	}
	public void setCamount(Integer camount) {
		this.camount = camount;
	}
	//若部分链接属性为null时toString方法将会报错
	@Override
	public String toString() {
		return "LiuYan [id=" + id + ", sno=" + sno + ", liuyan=" + liuyan + ", column=" + col + ", lamount=" + lamount
				+ ", ramount=" + ramount + ", camount=" + camount + ", keyword=" + keyword + ",\n\n likes=" + likes
				+ ",\n\n reposts=" + reposts + ",\n\n comments=" + comments + "]";
	}
	
	
}
