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

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="product_category")
public class ProductCategoryEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
 	
	@Column
	private String category_name;
	

	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy= "productCategoryEntity")
	private List<ProductEntity> productEntity;
	

public ProductCategoryEntity() {
	// TODO Auto-generated constructor stub
}


public ProductCategoryEntity(Integer id, String category_name, List<ProductEntity> productEntity) {
	super();
	this.id = id;
	this.category_name = category_name;
	this.productEntity = productEntity;
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getCategory_name() {
	return category_name;
}


public void setCategory_name(String category_name) {
	this.category_name = category_name;
}


public List<ProductEntity> getProductEntity() {
	return productEntity;
}


public void setProductEntity(List<ProductEntity> productEntity) {
	this.productEntity = productEntity;
}


@Override
public String toString() {
	return "ProductCategoryEntity [id=" + id + ", category_name=" + category_name + ", productEntity=" + productEntity
			+ "]";
}


 
	
	
	
	
}
