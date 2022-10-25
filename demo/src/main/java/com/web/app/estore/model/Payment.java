package com.web.app.estore.model;



import java.util.Date;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name ="Payment" )
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {
	
	@Id
	private String id;
	
	private String noc,cardno;
	private Date expiry;
	private int cvv;
	private String street,city,state;
	private int pincode;
	 
	}


