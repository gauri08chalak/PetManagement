package com.project.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pms.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
