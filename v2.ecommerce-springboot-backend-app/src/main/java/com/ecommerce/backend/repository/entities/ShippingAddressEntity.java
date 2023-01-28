package com.ecommerce.backend.repository.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "shipping_address")

public class ShippingAddressEntity {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; 
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private Integer mobileno;
	
	@Column
	private Integer pincode;
	
	@Column
	private Integer houseno;
	
	@Column
	private String street_name;
	
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String country;
	
	@OneToOne
	@JoinColumn(name="user_id",nullable = false)
	private UsersEntity usersEntity;
	
	public ShippingAddressEntity() {
		// TODO Auto-generated constructor stub
	}

	public ShippingAddressEntity(Integer id, String first_name, String last_name, Integer mobileno, Integer pincode,
			Integer houseno, String street_name, String city, String state, String country, UsersEntity usersEntity) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobileno = mobileno;
		this.pincode = pincode;
		this.houseno = houseno;
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.usersEntity = usersEntity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getMobileno() {
		return mobileno;
	}

	public void setMobileno(Integer mobileno) {
		this.mobileno = mobileno;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Integer getHouseno() {
		return houseno;
	}

	public void setHouseno(Integer houseno) {
		this.houseno = houseno;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public UsersEntity getUsersEntity() {
		return usersEntity;
	}

	public void setUsersEntity(UsersEntity usersEntity) {
		this.usersEntity = usersEntity;
	}

	@Override
	public String toString() {
		return "ShippingAddressEntity [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", mobileno=" + mobileno + ", pincode=" + pincode + ", houseno=" + houseno + ", street_name="
				+ street_name + ", city=" + city + ", state=" + state + ", country=" + country + ", usersEntity="
				+ usersEntity + "]";
	}
	
	
	
	
}
