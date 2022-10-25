package com.web.app.estore.repository;


import org.springframework.data.repository.CrudRepository;

import com.web.app.estore.model.User;


public interface UserRepository extends CrudRepository<User, String> {
	
	//Custom method to fetch User Object based non id field
	public User findByEmail(String email);

}
