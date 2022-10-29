package com.web.app.estore.model;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Wishlist")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Wishlist {
	
	@Id
	private String id;
	
	private String userid;
	private String productname;
	private String productdes;
	private String imageurl;
    private Double productprice;
    

    
}
