package com.avengers.myavengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.avengers.myavengers.model.entity.Avenger;
import com.avengers.myavengers.model.jpa.AvengersJpsRepository;

@SpringBootApplication
public class MyAvengersApplication implements CommandLineRunner{

	@Autowired
	AvengersJpsRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyAvengersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Avenger("Tony Stark", "Iron Man","Arc Reactor","Earth", "A"));
	}

	
}
