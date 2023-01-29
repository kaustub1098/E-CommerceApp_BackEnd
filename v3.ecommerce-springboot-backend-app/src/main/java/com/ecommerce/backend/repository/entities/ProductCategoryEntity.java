package com.ecommerce.backend.repository.entities;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;





@Entity
@Table(name="product_category")
public class ProductCategoryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private String id;
	
	

	@Column(name = "category_name")
	private String category_name;
	


	@OneToMany( mappedBy= "productCategoryEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ProductEntity> productEntity=new ArrayList<>();
	

public ProductCategoryEntity() {
	// TODO Auto-generated constructor stub
}


public ProductCategoryEntity( String category_name, List<ProductEntity> productEntity) {
	
	this.category_name = category_name;
	this.productEntity = productEntity;
}





public String getId() {
	return id;
}


public void setId(String id) {
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
	return "ProductCategoryEntity [id=" + id + ", category_name=" + category_name 
			+ "]";
}


 
	
	
	
	
}
