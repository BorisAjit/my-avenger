package com.avengers.myavengers.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Avenger {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String superHeroName;
	private String weapon;
	private String planet;
	private String rating;
	
	public Avenger() {
	}
	
	public Avenger(int id, String name, String superHeroName, String weapon, String planet, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.superHeroName = superHeroName;
		this.weapon = weapon;
		this.planet = planet;
		this.rating = rating;
	}
	public Avenger(String name, String superHeroName, String weapon, String planet, String rating) {
		super();
		this.name = name;
		this.superHeroName = superHeroName;
		this.weapon = weapon;
		this.planet = planet;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuperHeroName() {
		return superHeroName;
	}
	public void setSuperHeroName(String superHeroName) {
		this.superHeroName = superHeroName;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Avenger [id=" + id + ", name=" + name + ", superHeroName=" + superHeroName + ", weapon=" + weapon
				+ ", planet=" + planet + ", rating=" + rating + "]";
	}
	
}
