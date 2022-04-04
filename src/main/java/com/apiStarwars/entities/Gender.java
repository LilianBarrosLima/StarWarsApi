package com.apiStarwars.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="GENDER")
public class Gender implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="gender_id")
	@GeneratedValue(strategy= GenerationType.SEQUENCE)	
	private Integer gender_Id;	
	
	@Column(name="gender_name")
	private String gender_name;	

}
