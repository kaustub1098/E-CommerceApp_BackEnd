package com.ecommerce.backend.dto;

import com.ecommerce.backend.repository.entities.ShippingAddressEntity;

import lombok.Data;

@Data
public class UsersDTO {

	private Long id;
	
	private String user_firstName;

	private String user_lastName;
	
	private String user_address;
	
	private String user_emailid;
	
	private String user_password;
	
	private String user_phoneNumber;
	
	private ShippingAddressEntity shipping_address_id;
	
	
}
