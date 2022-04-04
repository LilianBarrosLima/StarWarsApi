package com.apiStarwars.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "SPECIE")
public class Specie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "species_id")
	private Integer species_Id;

	@Column(name = "species")
	private String species;

	public Integer getSpecies_Id() {
		return species_Id;
	}

	public void setSpecies_Id(Integer species_Id) {
		this.species_Id = species_Id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

}