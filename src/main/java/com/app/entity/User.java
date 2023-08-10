package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	 private String name;
	 @Id
	 private String username;
	 private String email;
	 private String phone;
	 private String password;
	 private String cpassword;
	// private String gender;
}
