package com.web.app.estore.model;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Table(name ="Product" )
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	
	@Id
	private String id;
	
	    private String name;
	    private String brand;
	    private String madein;
	    private String category;
	    private String description;
	    private String imgpath;
	    private Double price;
	    

	    
} 
