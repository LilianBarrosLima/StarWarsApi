package com.apiStarwars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiStarwars.entities.Films;

public interface FilmsRepository extends JpaRepository<Films, Integer>{

}	