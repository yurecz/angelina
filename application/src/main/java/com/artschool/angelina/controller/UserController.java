package com.artschool.angelina.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.artschool.angelina.entity.TestUser;
import com.artschool.angelina.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<TestUser> getUsers() {
		return (List<TestUser>) userRepository.findAll();
	}

	@PostMapping("/users")
	public void addUser(@RequestBody TestUser user) {
		userRepository.save(user);
	}

}
