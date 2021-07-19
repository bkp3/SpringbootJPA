package com.jpa.test.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;
import java.util.*;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	// Derived Query Methods

	// findByNameStartingWith(String prefix)
	// findByNameEndingWith(String suffix)
	// findByNameContaining(String words)
	// findByNameLike(String likePattern)
	// findByAgeLessThan(int age)
	// findByAgeGreaterThanEqual(int age)

	// JPQL

//	@Query("SELECT u FROM User u")
//	public List<User> getAllUsers();
//	
//	
//	@Query("SELECT u FROM User u WHERE u.name=:n")
//	public List<User> getAllUsersByName(@Param("n") String name);

//	@Query("SELECT u FROM User u WHERE u.name=:n AND u.city=:c")
//	public List<User> getAllUsersByNameAndCity(@Param("n") String name,@Param("c") String city);
//	
	
	// Native Queries
	@Query(value= "SELECT * FROM user",nativeQuery = true)
	public List<User> getUsers();

}
