package com.web.app.estore.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.app.estore.model.Cart;


public interface CartRepository extends CrudRepository<Cart, String> {
	
	public List<Cart> findByUserid(String userid);

}
