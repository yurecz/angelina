package com.artschool.angelina.model.user;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserTest {

	@Autowired
	UserRepository userRepository;
	
	@Test
	void StoreAndRetrieveUser() {
		User expectedUser = new User("First User");
		expectedUser = userRepository.save(expectedUser);
		
		Optional<User> actualUser = userRepository.findById(expectedUser.getId());
		
		assertTrue(actualUser.isPresent());
		assertEquals("First User",actualUser.get().getFullName());
	}

}
