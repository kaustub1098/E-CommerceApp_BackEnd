package com.ecommerce.backend.dto;

import lombok.Data;

@Data
public class UsersDTO {

	private Integer id;
	
	private String user_firstName;

	private String user_lastName;
	
	private String user_address;
	
	private String user_emailid;
	
	private String user_password;
	
	private String user_phoneNumber;
	
	
}
