package com.jpa.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context=SpringApplication.run(SpringbootJpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Rakesh Kumar");
//		user.setCity("Delhi");
//		user.setStatus("I am a Student");
//		
//		User user1=userRepository.save(user);
//		System.out.println(user1);
//		
		
		
		//create object of User
//		User user2 = new User();
//		user2.setName("Mohit");
//		user2.setCity("Patna");
//		user2.setStatus(".Net Developer");
//		
//		User user3 = new User();
//		user3.setName("Mukesh");
//		user3.setCity("Kolkata");
//		user3.setStatus("Python Developer");
//		
		//saving single user
		//User res2 = userRepository.save(user2);
		
		//save multiple user
//		List<User>list=new ArrayList<>();
//		list.add(user2);
//		list.add(user3);
//		
//		Iterable<User>resList=userRepository.saveAll(list);
//		resList.forEach(user->{
//			System.out.println(user);
//		});
//		
		
//		System.out.println("User saved"+res2);
		
		
		
		//update the user at a id number = 3
		
//		Optional<User> optional=userRepository.findById(3);
//		
//		User user=optional.get();
//		
//		System.out.println(user);
//		
//		user.setCity("Chennai");
//		
//		User user1=userRepository.save(user);
//		System.out.println("updated value :- "+user1);
//		
//		
		
		
		//how to read data
		
		// (i) by using findById(3)
//		Optional<User>optional=userRepository.findById(3);
//		User user = optional.get();
//		System.out.println(user);
//		
		
		// (ii) by using findAll()
		
//		Iterable<User>res=userRepository.findAll();
//		res.forEach(user->{
//			System.out.println(user);
//		});
//		
		
		
		//Deleting the user element
		
		// (i) delete(user)
		// (ii) deleteAll()
		// (iii) deleteById(id)
		
		
		//deleteById(2)
		
//		userRepository.deleteById(2);
//		System.out.println("deleted");
//		
//		data getting from Derived Query Methods
		
//		List<User>user=userRepository.findByName("Mohit");
//		for(User x:user) {
//			System.out.println(x);
//		}
//		
		
		List<User>users=userRepository.findByNameAndCity("Mohit", "Chennai");
		for(User x:users) {
			System.out.println(x);
		}
		System.out.println("Done");
	}

}
