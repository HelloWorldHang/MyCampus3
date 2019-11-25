package com.syh.bean;

public class Column {
	private Integer id;
	private String name;
	
	public Column() {
		super();
	}
	
	public Column(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Column [id=" + id + ", name=" + name + "]";
	}
	
	
}
