package com.artschool.angelina;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.artschool.angelina.entity.TestUser;
import com.artschool.angelina.repository.UserRepository;

@SpringBootApplication
public class OurSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurSchoolApplication.class, args);
	}

	@Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                TestUser user = new TestUser(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
