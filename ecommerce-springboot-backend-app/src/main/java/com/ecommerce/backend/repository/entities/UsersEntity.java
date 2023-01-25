package com.ecommerce.backend.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class UsersEntity {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String user_firstName;
	
	@Column
	private String user_lastName;
	
	@Column
	private String user_address;
	
	@Column
	private String user_emailid;
	
	@Column
	private String user_password;
	
	@Column
	private String user_phoneNumber;
	
	
	@OneToOne(mappedBy = "usersEntity")	
	private ShippingAddressEntity shippingAddressEntity;
	
	
	
	
}
