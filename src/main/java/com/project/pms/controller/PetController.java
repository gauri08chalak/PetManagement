package com.project.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pms.model.Pet;
import com.project.pms.repository.PetRepository;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetRepository petRepository;
    
   

    @GetMapping("/")
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

   
//
    
       
}
