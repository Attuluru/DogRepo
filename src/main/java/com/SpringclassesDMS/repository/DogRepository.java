package com.SpringclassesDMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringclassesDMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	 
}
