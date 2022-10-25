package com.web.app.estore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.app.estore.model.Wishlist;

public interface WishlistRepository extends CrudRepository<Wishlist, String> {

	public List<Wishlist> findByUserid(String userid);
}
