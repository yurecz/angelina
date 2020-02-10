package com.artschool.angelina.account;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class AccountRepositoryTest {

	@Autowired
	AccountRepository accountRepository;
	@Test
	void storeAndRetrieveAccount() {
		Account account = new Account("Test User","test.user@mai.com");
		account = accountRepository.save(account);
				
		assertThat(accountRepository.findById(account.getId())).isNotNull();
		
	}
}
