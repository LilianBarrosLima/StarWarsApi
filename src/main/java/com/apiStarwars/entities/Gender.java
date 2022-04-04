package com.apiStarwars.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="GENDER")
public class Gender {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="gender_id")
	private Integer gender_Id;	
	
	@Column(name="gender_name")
	private String gender_name;

	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gender(Integer gender_Id, String gender_name) {
		super();
		this.gender_Id = gender_Id;
		this.gender_name = gender_name;
	}

	public Integer getGender_Id() {
		return gender_Id;
	}

	public void setGender_Id(Integer gender_Id) {
		this.gender_Id = gender_Id;
	}

	public String getGender_name() {
		return gender_name;
	}

	public void setGender_name(String gender_name) {
		this.gender_name = gender_name;
	}
	
	

}
