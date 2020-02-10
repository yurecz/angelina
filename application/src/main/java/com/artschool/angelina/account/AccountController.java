package com.artschool.angelina.account;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {
	private final AccountRepository accountRepository;

	public AccountController(AccountRepository accountRepository) {
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
