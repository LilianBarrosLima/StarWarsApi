package com.apiStarwars.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiStarwars.entities.People;
import com.apiStarwars.repositories.RepositoryPeople;
import com.apiStarwars.services.Message;


@RestController
@RequestMapping("/api") // http://localhost:8080/api
public class PeopleController {
	
	
	@Autowired
	private RepositoryPeople repositoryPeople;

//**********************getUser******************************GET
	@RequestMapping(value = "/people", method = RequestMethod.GET)
	public @ResponseBody List<People> getuser() {
		return repositoryPeople.findAll();
	}

//**********************createUser******************************POST
	@RequestMapping(value = "/people", method = RequestMethod.POST)
	public @ResponseBody People createUser(@RequestBody People people){
		return repositoryPeople.save(people);
	}

//**********************findById******************************get
	@RequestMapping(value = "/people/{personId}", method = RequestMethod.GET)
	//public @ResponseBody People findById(@PathVariable Integer personId) {
	public @ResponseBody Optional<People> findById(@PathVariable Integer personId) {
		return repositoryPeople.findById(personId);
	}

//**********************updateUser******************************PUT
	@RequestMapping(value = "/people", method = RequestMethod.PUT)
	public @ResponseBody People updateUser(@RequestBody People people) {
		return repositoryPeople.save(people);
	}
//**********************DeleteUser******************************DELETE
	@RequestMapping(value = "/people/{personId}", method = RequestMethod.DELETE)
	public @ResponseBody Message deleteUser(@PathVariable Integer personId) {
		Message message = new Message();
		try {
			Optional<People> people = findById(personId);
			//People people = findById(personId);
			this.repositoryPeople.deleteById(personId);
			message.setMessage("People Removed");
		}catch(Exception erro){
			message.setMessage("Remove fail: " + erro.getMessage());			
		}
		return message;
	}
	
}
