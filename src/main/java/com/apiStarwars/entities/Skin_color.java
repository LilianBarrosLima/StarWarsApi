package com.apiStarwars.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "SKIN_COLOR")
public class Skin_color {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="id_skin_color")
	private Integer skin; 
	
	@ManyToOne
	@JoinColumn(name="people_c_skin")
	@JsonBackReference  //cria uma dependência lógica do atributo, mas não o serializa(1:1)
	private People people_c_skin;
	
	@ManyToOne
	@JoinColumn(name="colors_p_skin")
	private Color colors_p_skin;

	public Integer getSkin() {
		return skin;
	}

	public void setSkin(Integer skin) {
		this.skin = skin;
	}

	public People getPeople_c_skin() {
		return people_c_skin;
	}

	public void setPeople_c_skin(People people_c_skin) {
		this.people_c_skin = people_c_skin;
	}

	public Color getColors_p_skin() {
		return colors_p_skin;
	}

	public void setColors_p_skin(Color colors_p_skin) {
		this.colors_p_skin = colors_p_skin;
	}
	
	

}