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
@Getter
@Setter
public class ProductCategoryEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
 	
	@Column
	private String category_name;
	

	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy= "productCategoryEntity")
	private List<ProductEntity> productEntity;
	


 
	
	
	
	
}
