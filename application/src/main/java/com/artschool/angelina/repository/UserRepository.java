package com.artschool.angelina.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.artschool.angelina.entity.TestUser;

@Repository
public interface UserRepository extends CrudRepository<TestUser, Long>{}

