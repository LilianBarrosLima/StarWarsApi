package com.apiStarwars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiStarwars.entities.People;

public interface RepositoryPeople extends JpaRepository<People, Integer>{

}