package com.apiStarwars.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "COLOR")
public class Color {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "color_id")
	private Integer color_Id;

	@Column(name = "color_name")
	private String color_name;

	public Integer getColor_Id() {
		return color_Id;
	}

	public void setColor_Id(Integer color_Id) {
		this.color_Id = color_Id;
	}

	public String getColor_name() {
		return color_name;
	}

	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}

	public Color(Integer color_Id, String color_name) {
		super();
		this.color_Id = color_Id;
		this.color_name = color_name;
	}

	public Color() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}