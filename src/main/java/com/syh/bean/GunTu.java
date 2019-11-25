package com.syh.bean;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Set;

public class GunTu {
	private Integer id;
	private String img;
	private String link;
	private String title; 
	private MultipartFile file;
	private Set<Like> likes;
	private List<Comment> comments;
	public GunTu() {
		super();
	}
	
	public GunTu(Integer id, String img, String link, String title, MultipartFile file, Set<Like> likes,
			List<Comment> comments) {
		super();
		this.id = id;
		this.img = img;
		this.link = link;
		this.title = title;
		this.file = file;
		this.likes = likes;
		this.comments = comments;
	}

	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Set<Like> getLikes() {
		return likes;
	}
	public void setLikes(Set<Like> likes) {
		this.likes = likes;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "GunTu [id=" + id + ", img=" + img + ", link=" + link + ", likes=" + likes + ", comments=" + comments
				+ "]";
	}
	
}
