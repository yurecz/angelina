package com.artschool.angelina.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private final String name;
	private final String email;

	protected Account() {
		this.name = "Default Name";
		this.email = "Default Email";
	}
	public Account(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, name='%s', email='%s']", id, name, email);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
