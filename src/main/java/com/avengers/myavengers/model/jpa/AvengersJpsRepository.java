package com.avengers.myavengers.model.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avengers.myavengers.model.entity.Avenger;

public interface AvengersJpsRepository extends JpaRepository<Avenger, Integer>{

}
