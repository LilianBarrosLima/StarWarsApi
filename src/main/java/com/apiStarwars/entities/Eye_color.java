package com.apiStarwars.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "EYE_COLOR")
public class Eye_color {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_eye_color")
	private Integer id_eye_color;

	@ManyToOne
	@JoinColumn(name = "colors_p_eye")
	private Color colors_p_eye;

	@ManyToOne
	@JoinColumn(name = "people_c_eye")
	@JsonBackReference
	private People people_c_eye;

	public Eye_color(Integer id_eye_color, Color colors_p_eye, People people_c_eye) {
		super();
		this.id_eye_color = id_eye_color;
		this.colors_p_eye = colors_p_eye;
		this.people_c_eye = people_c_eye;
	}

	public Eye_color() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_eye_color() {
		return id_eye_color;
	}

	public void setId_eye_color(Integer id_eye_color) {
		this.id_eye_color = id_eye_color;
	}

	public Color getColors_p_eye() {
		return colors_p_eye;
	}

	public void setColors_p_eye(Color colors_p_eye) {
		this.colors_p_eye = colors_p_eye;
	}

	public People getPeople_c_eye() {
		return people_c_eye;
	}

	public void setPeople_c_eye(People people_c_eye) {
		this.people_c_eye = people_c_eye;
	}

}