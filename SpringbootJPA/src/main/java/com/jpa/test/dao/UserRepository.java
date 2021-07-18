package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;
import java.util.*;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	
	//JPQL
	
	// findByNameStartingWith(String prefix)
	// findByNameEndingWith(String suffix)
	// findByNameContaining(String words)
	// findByNameLike(String likePattern)
	// findByAgeLessThan(int age)
	// findByAgeGreaterThanEqual(int age)

}
