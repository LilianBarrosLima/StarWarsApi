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

import com.apiStarwars.entities.Films;
import com.apiStarwars.repositories.FilmsRepository;
import com.apiStarwars.services.Message;


@RestController
@RequestMapping("/api") // http://localhost:8080/api
public class FilmsController {
	
	
	@Autowired
	private FilmsRepository filmsrepository;

//**********************getfilm******************************GET
	@RequestMapping(value = "/film", method = RequestMethod.GET)
	public @ResponseBody List<Films> getfilm() {
		return filmsrepository.findAll();
	}

//**********************createfilm******************************POST
	@RequestMapping(value = "/film", method = RequestMethod.POST)
	public @ResponseBody Films createfilm(@RequestBody Films films){
		return filmsrepository.save(films);
	}

//**********************findFilmById******************************GET
	@RequestMapping(value = "/film/{episode_id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Films> findById(@PathVariable Integer episode_id) {
		return filmsrepository.findById(episode_id);
	}

//**********************updateFilm******************************PUT
	@RequestMapping(value = "/film", method = RequestMethod.PUT)
	public @ResponseBody Films updateFilm(@RequestBody Films films) {
		return filmsrepository.save(films);
	}
//**********************DeleteFilm******************************DELETE
	@RequestMapping(value = "/film/{episode_id}", method = RequestMethod.DELETE)
	public @ResponseBody Message deletefilm(@PathVariable Integer episode_id) {
		Message message = new Message();
		try {
			Optional<Films> films = findById(episode_id);
			//Films films = findById(episode_id);
			this.filmsrepository.deleteById(episode_id);
			message.setMessage("Films Removed");
		}catch(Exception erro){
			message.setMessage("Remove fail: " + erro.getMessage());			
		}
		return message;
	}
	
}
