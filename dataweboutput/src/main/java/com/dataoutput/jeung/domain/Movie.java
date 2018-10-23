package com.dataoutput.jeung.domain;

public class Movie {

	private int id;
	private String name;
	private String description;
	private String img;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", description=" + description + ", img=" + img + "]";
	}
	
}
