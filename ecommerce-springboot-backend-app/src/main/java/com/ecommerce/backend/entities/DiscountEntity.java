package com.ecommerce.backend.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;



public class DiscountEntity {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private Long id;

@Column
private Integer discount_price;
	
@Column
private String discount_description;

//@OneToMany(cascade = CascadeType.ALL,mappedBy = "discountEntity")
//private List<ProductEntity> productEntity;



public DiscountEntity() {
	// TODO Auto-generated constructor stub
}



public DiscountEntity( Integer discount_price, String discount_description) {
	
	this.discount_price = discount_price;
	this.discount_description = discount_description;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public Integer getDiscount_price() {
	return discount_price;
}



public void setDiscount_price(Integer discount_price) {
	this.discount_price = discount_price;
}



public String getDiscount_description() {
	return discount_description;
}



public void setDiscount_description(String discount_description) {
	this.discount_description = discount_description;
}





@Override
public String toString() {
	return "DiscountEntity [id=" + id + ", discount_price=" + discount_price + ", discount_description="
			+ discount_description  + "]";
}

	 
}
