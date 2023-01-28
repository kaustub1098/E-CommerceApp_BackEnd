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
	
public ProductEntity() {
	// TODO Auto-generated constructor stub
}

public ProductEntity(Integer id, String product_name, String product_description, Integer product_price,
		Integer product_stock_quantity, DiscountEntity discountEntity, ProductCategoryEntity productCategoryEntity,
		OrdersEntity ordersEntity) {
	super();
	this.id = id;
	this.product_name = product_name;
	this.product_description = product_description;
	this.product_price = product_price;
	this.product_stock_quantity = product_stock_quantity;
	this.discountEntity = discountEntity;
	this.productCategoryEntity = productCategoryEntity;
	this.ordersEntity = ordersEntity;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}

public String getProduct_description() {
	return product_description;
}

public void setProduct_description(String product_description) {
	this.product_description = product_description;
}

public Integer getProduct_price() {
	return product_price;
}

public void setProduct_price(Integer product_price) {
	this.product_price = product_price;
}

public Integer getProduct_stock_quantity() {
	return product_stock_quantity;
}

public void setProduct_stock_quantity(Integer product_stock_quantity) {
	this.product_stock_quantity = product_stock_quantity;
}

public DiscountEntity getDiscountEntity() {
	return discountEntity;
}

public void setDiscountEntity(DiscountEntity discountEntity) {
	this.discountEntity = discountEntity;
}

public ProductCategoryEntity getProductCategoryEntity() {
	return productCategoryEntity;
}

public void setProductCategoryEntity(ProductCategoryEntity productCategoryEntity) {
	this.productCategoryEntity = productCategoryEntity;
}

public OrdersEntity getOrdersEntity() {
	return ordersEntity;
}

public void setOrdersEntity(OrdersEntity ordersEntity) {
	this.ordersEntity = ordersEntity;
}

@Override
public String toString() {
	return "ProductEntity [id=" + id + ", product_name=" + product_name + ", product_description=" + product_description
			+ ", product_price=" + product_price + ", product_stock_quantity=" + product_stock_quantity
			+ ", discountEntity=" + discountEntity + ", productCategoryEntity=" + productCategoryEntity
			+ ", ordersEntity=" + ordersEntity + "]";
}

	
	
	
}
