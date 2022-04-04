package com.apiStarwars.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "PEOPLE")
public class People {
		
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Integer personId;
	
	@NotNull
	@Column(name = "name")
	private String name;

	@Column(name = "height")
	private Integer height;

	@Column(name = "mass")
	private Integer mass;

	@Column(name = "birth")
	private String birth;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'", timezone = "GMT")
	@Column(name = "created")
	private Date created;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'", timezone = "GMT")
	@Column(name = "edited")
	private Date edited;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "gender_Id") 
	private Gender gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "specie_Id") 
	private Specie specie;
	
	@OneToMany(mappedBy="people_c_hair")
	@JsonManagedReference
	private List<Hair_color> hair_colors;
	
	@OneToMany(mappedBy="people_c_eye")
	@JsonManagedReference
	private List<Eye_color> eye_colors;
	
	@OneToMany(mappedBy="people_c_skin")
	@JsonManagedReference
	private List<Skin_color> skin_colors;
	
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String name, Integer height, Integer mass, String birth, Gender gender, Specie specie, List<Hair_color> hair_colors, List<Eye_color> eye_colors,
			List<Skin_color> skin_colors) {
		
		super();
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.birth = birth;
		this.gender = gender;
		this.specie = specie;
		this.hair_colors = hair_colors;
		this.eye_colors = eye_colors;
		this.skin_colors = skin_colors;
	}

	public Integer getPersonId() {
		return personId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getMass() {
		return mass;
	}

	public void setMass(Integer mass) {
		this.mass = mass;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Date getCreated() {
		return created;
	}

	public Date getEdited() {
		return edited;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Specie getSpecie() {
		return specie;
	}

	public void setSpecie(Specie specie) {
		this.specie = specie;
	}

	public List<Hair_color> getHair_colors() {
		return hair_colors;
	}

	public void setHair_colors(List<Hair_color> hair_colors) {
		this.hair_colors = hair_colors;
	}

	public List<Eye_color> getEye_colors() {
		return eye_colors;
	}

	public void setEye_colors(List<Eye_color> eye_colors) {
		this.eye_colors = eye_colors;
	}

	public List<Skin_color> getSkin_colors() {
		return skin_colors;
	}

	public void setSkin_colors(List<Skin_color> skin_colors) {
		this.skin_colors = skin_colors;
	}
	
	

}