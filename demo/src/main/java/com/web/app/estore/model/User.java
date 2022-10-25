package com.web.app.estore.model;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

	@Id
	private String id;

	private String email;
	private String fname;
	private String lname;
	private String password;
	private Boolean isadmin = false;

	// ADDRESS

	private String phoneNo;
	private String street;
	private String city;
	private int pincode;

}
