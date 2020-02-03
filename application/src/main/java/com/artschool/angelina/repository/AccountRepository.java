package com.artschool.angelina.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.artschool.angelina.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{
	
	//@Override
	Account save(Account account);
	
}

