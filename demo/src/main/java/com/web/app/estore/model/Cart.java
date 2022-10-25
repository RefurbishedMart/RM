package com.web.app.estore.model;

import javax.persistence.Table;

//import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="Cart" )
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cart {
	
	@Id
	private String id;
	private String name;
	private String description;
	private String imgpath;
	private String userid;
	private Double price;
	private Integer  quantity =1;
	
  
	

	
} 
