package com.project.pms.service;

import java.util.List;

import com.project.pms.model.Pet;

public abstract class PetService {
    abstract List<Pet> getAllPets();
    abstract Pet getPetById(Long id);
    abstract Pet addPet(Pet pet);
    abstract void deletePet(Long id);
    abstract Pet updatePet(Long id, Pet pet);
}