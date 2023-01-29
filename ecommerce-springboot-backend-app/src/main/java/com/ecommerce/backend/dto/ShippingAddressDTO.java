package com.ecommerce.backend.dto;

import lombok.Data;

@Data
public class ShippingAddressDTO {

	
	private Integer id; 
	
	private String first_name;
	
	private String last_name;
	
	private Integer mobileno;

	private Integer pincode;
	
	private Integer houseno;
	
	private String street_name;
	
	private String city;
	
	private String state;
	
	private String country;
}
