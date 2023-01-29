package com.ecommerce.backend.entities;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
@Entity
@Table(name = "order_items")
public class Order_items {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id",referencedColumnName = "id")
	private OrdersEntity ordersEntity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_id",nullable = false)
	private ProductEntity productEntity;

	@Column
	private Long order_totalPrice;
	
	public Order_items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order_items(OrdersEntity ordersEntity, ProductEntity productEntity, Long order_totalPrice) {
		super();
		this.ordersEntity = ordersEntity;
		this.productEntity = productEntity;
		this.order_totalPrice = order_totalPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrdersEntity getOrdersEntity() {
		return ordersEntity;
	}

	public void setOrdersEntity(OrdersEntity ordersEntity) {
		this.ordersEntity = ordersEntity;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public Long getOrder_totalPrice() {
		return order_totalPrice;
	}

	public void setOrder_totalPrice(Long order_totalPrice) {
		this.order_totalPrice = order_totalPrice;
	}

	@Override
	public String toString() {
		return "Order_items [id=" + id + ", ordersEntity=" + ordersEntity + ", productEntity=" + productEntity
				+ ", order_totalPrice=" + order_totalPrice + "]";
	}

	
	
	
	
	

}
