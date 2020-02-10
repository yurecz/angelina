package com.artschool.angelina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OurSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurSchoolApplication.class, args);
	}

/*	@Bean
    CommandLineRunner init(AccountRepository accountRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            	Account user = new Account(name, name.toLowerCase() + "@domain.com");
                accountRepository.save(user);
            });
            accountRepository.findAll().forEach(System.out::println);
        };
    } */
}
