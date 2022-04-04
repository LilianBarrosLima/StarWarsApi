package com.apiStarwars.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "HAIR_COLOR")
public class Hair_color {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="id_hair_color")
	private Integer id_hair_color;
	
	@ManyToOne
	@JoinColumn(name="people_c_hair")
	@JsonBackReference  //cria uma dependência lógica do atributo, mas não o serializa(1:1)
	private People people_c_hair; 
	
	@ManyToOne
	@JoinColumn(name="colors_p_hair")
	private Color colors_p_hair;
	
	public Hair_color(Integer id_hair_color, People people_c_hair, Color colors_p_hair) {
		super();
		this.id_hair_color = id_hair_color;
		this.people_c_hair = people_c_hair;
		this.colors_p_hair = colors_p_hair;
	}

	public Hair_color() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_hair_color() {
		return id_hair_color;
	}

	public void setId_hair_color(Integer id_hair_color) {
		this.id_hair_color = id_hair_color;
	}

	public People getPeople_c_hair() {
		return people_c_hair;
	}

	public void setPeople_c_hair(People people_c_hair) {
		this.people_c_hair = people_c_hair;
	}

	public Color getColors_p_hair() {
		return colors_p_hair;
	}

	public void setColors_p_hair(Color colors_p_hair) {
		this.colors_p_hair = colors_p_hair;
	}
	
		
}