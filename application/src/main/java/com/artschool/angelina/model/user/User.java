package com.artschool.angelina.model.user;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	@Setter
	private UUID id;

	private String fullName; 
	
	private String password;

	public User(String fullName) {
		this.fullName = fullName;
	}

}
