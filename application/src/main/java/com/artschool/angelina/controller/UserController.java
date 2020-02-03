package com.artschool.angelina.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.artschool.angelina.model.Account;
import com.artschool.angelina.repository.AccountRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	private final AccountRepository accountRepository;

	public UserController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@GetMapping("/users")
	public List<Account> getUsers() {
		return (List<Account>) accountRepository.findAll();
	}

	@PostMapping("/users")
	public void addUser(@RequestBody Account account) {
		accountRepository.save(account);
	}

}
