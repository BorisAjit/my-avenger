package com.avengers.myavengers.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avengers.myavengers.model.entity.Avenger;
import com.avengers.myavengers.model.jpa.AvengersJpsRepository;

@RequestMapping("/avengers")
@RestController
public class AvengersController {

	@Autowired
	AvengersJpsRepository repository;
	
	@GetMapping
	public List<Avenger> findall() {
		 return repository.findAll();
	}
	
	@PostMapping
	public void addAvenger(@NonNull @RequestBody Avenger avenger) {
		repository.save(avenger);
	}
	
	@GetMapping(path="{id}")
	public Avenger getAvengerById(@PathVariable("id") int id) {
		return repository.getById(id);
	}
	
	@PutMapping(path = "{id}")
	public void updateAvenger(@PathVariable("id") int id,@NonNull @RequestBody Avenger avenger) {
		avenger.setId(id);
		repository.save(avenger);
	}
	
	@DeleteMapping(path = "{id}")
	public void deletePersonById(@PathVariable("id") int id) {
		repository.delete(repository.getById(id));
	}
	
}
