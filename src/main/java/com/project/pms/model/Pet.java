package com.project.pms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private int age;
	private String breed;
	private String description;
	
	public Pet(Long id, String name, int age, String breed, String description) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.description = description;
	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
