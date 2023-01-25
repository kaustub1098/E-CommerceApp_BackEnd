package com.ecommerce.backend.repository.entities;

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

@Entity
@Table(name="discounts")
@Data
public class DiscountEntity {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private Integer id;

@Column
private Integer discount_price;
	
@Column
private String discount_description;

@OneToMany(cascade = CascadeType.ALL,mappedBy = "discountEntity")
private List<ProductEntity> productEntity;
	 
}
