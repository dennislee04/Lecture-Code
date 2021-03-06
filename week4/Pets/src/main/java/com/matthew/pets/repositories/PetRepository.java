package com.matthew.pets.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matthew.pets.models.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long>{
	List<Pet> findAll();
	List<Pet> findBySpecies(String species);
	//Optional<Pet> findById
}
