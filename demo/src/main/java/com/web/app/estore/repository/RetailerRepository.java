package com.web.app.estore.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.app.estore.model.Retailer;


public interface RetailerRepository extends CrudRepository<Retailer, String>{

	Retailer findByEmail(String email);
	
}
