package com.web.app.estore.model;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name ="compare" )
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Compare {
	
	@Id
	private String id;
	
	private String name,brand;
	private String category,madein;
	private double price;
	private String imgpath;
	
 	
}
