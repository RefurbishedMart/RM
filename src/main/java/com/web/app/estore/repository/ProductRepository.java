package com.web.app.estore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.app.estore.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	//Custom method to find Products based on category field
	public List<Product> findByCategory(String category);

	public List<Product> findByName(String name);
		

}
