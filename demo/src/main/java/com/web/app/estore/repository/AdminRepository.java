package com.web.app.estore.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.app.estore.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, String>{

	Admin findByEmail(String email);
	

}
