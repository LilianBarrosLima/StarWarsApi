package com.apiStarwars.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "SKIN_COLOR")
public class Skin_color implements Serializable{
	private static final long serialVersionUID = 1L;
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

}