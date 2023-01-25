package com.ecommerce.backend.repository.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="product_info")
@Getter
@Setter
public class ProductEntity {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column
	private String product_name;
	
	@Column
	private String product_description;
	
	@Column
	private Integer product_price;
	
	
	@Column
	private Integer product_stock_quantity;
	
//	@Column
//	private Integer category_id;
//		
//	@Column
//	private Integer discount_id;
	
	
	@ManyToOne()
	@JoinColumn(name="discount_id",nullable = false)
	private DiscountEntity discountEntity;
	
	@ManyToOne()
	@JoinColumn(name="category_id",nullable = false)
	private ProductCategoryEntity productCategoryEntity;
	
	@ManyToOne()
	@JoinColumn(name="order_id",nullable = false)
	private OrdersEntity ordersEntity;
	
//	@Column
//	private Integer order_id;
//	
	


	
	
	
}
