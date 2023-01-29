package com.ecommerce.backend.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")

public class UsersEntity {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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
	
	
	
	
	@OneToOne()
	@JoinColumn(name="shipping_address_id",nullable = false)
	private ShippingAddressEntity shippingAddressEntity;
	

	
	public UsersEntity() {
		// TODO Auto-generated constructor stub
	}



	public UsersEntity(Long id, String user_firstName, String user_lastName, String user_address,
			String user_emailid, String user_password, String user_phoneNumber,
			ShippingAddressEntity shippingAddressEntity) {
		super();
		this.id = id;
		this.user_firstName = user_firstName;
		this.user_lastName = user_lastName;
		this.user_address = user_address;
		this.user_emailid = user_emailid;
		this.user_password = user_password;
		this.user_phoneNumber = user_phoneNumber;
		this.shippingAddressEntity = shippingAddressEntity;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUser_firstName() {
		return user_firstName;
	}



	public void setUser_firstName(String user_firstName) {
		this.user_firstName = user_firstName;
	}



	public String getUser_lastName() {
		return user_lastName;
	}



	public void setUser_lastName(String user_lastName) {
		this.user_lastName = user_lastName;
	}



	public String getUser_address() {
		return user_address;
	}



	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}



	public String getUser_emailid() {
		return user_emailid;
	}



	public void setUser_emailid(String user_emailid) {
		this.user_emailid = user_emailid;
	}



	public String getUser_password() {
		return user_password;
	}



	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}



	public String getUser_phoneNumber() {
		return user_phoneNumber;
	}



	public void setUser_phoneNumber(String user_phoneNumber) {
		this.user_phoneNumber = user_phoneNumber;
	}



	public ShippingAddressEntity getShippingAddressEntity() {
		return shippingAddressEntity;
	}



	public void setShippingAddressEntity(ShippingAddressEntity shippingAddressEntity) {
		this.shippingAddressEntity = shippingAddressEntity;
	}



	@Override
	public String toString() {
		return "UsersEntity [id=" + id + ", user_firstName=" + user_firstName + ", user_lastName=" + user_lastName
				+ ", user_address=" + user_address + ", user_emailid=" + user_emailid + ", user_password="
				+ user_password + ", user_phoneNumber=" + user_phoneNumber + ", shippingAddressEntity="
				+ shippingAddressEntity + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
