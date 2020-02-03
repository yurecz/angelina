package com.artschool.angelina;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.artschool.angelina.model.Account;
import com.artschool.angelina.repository.AccountRepository;

@SpringBootApplication
public class OurSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurSchoolApplication.class, args);
	}

	@Bean
    CommandLineRunner init(AccountRepository accountRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            	Account user = new Account(name, name.toLowerCase() + "@domain.com");
                accountRepository.save(user);
            });
            accountRepository.findAll().forEach(System.out::println);
        };
    }
}
