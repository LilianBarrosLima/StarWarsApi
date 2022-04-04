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
@Entity(name = "EYE_COLOR")
public class Eye_color implements Serializable{
	private static final long serialVersionUID = 1L;

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

}