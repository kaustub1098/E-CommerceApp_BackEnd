package com.ecommerce.backend.repository.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="orders")

public class OrdersEntity {

			
	 	   //@GeneratedValue(strategy = GenerationType.SEQUENCE)
		    
		    
			
		    @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    @Column(name="id")
		    private Integer id;
			
			@Column
			@CreationTimestamp
		    private LocalDateTime order_date;
		     
		    @Column
		    private Long order_total_Price;
		    @Column
		    private String order_items;
		    @Column
		    private String payment_type;
		

		    @OneToMany(cascade = CascadeType.ALL,mappedBy = "ordersEntity")
		    private List<ProductEntity> productEntity;

		
	public OrdersEntity() {
		// TODO Auto-generated constructor stub
	}


	public OrdersEntity(Integer id, LocalDateTime order_date, Long order_total_Price, String order_items,
			String payment_type, List<ProductEntity> productEntity) {
		super();
		this.id = id;
		this.order_date = order_date;
		this.order_total_Price = order_total_Price;
		this.order_items = order_items;
		this.payment_type = payment_type;
		this.productEntity = productEntity;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDateTime getOrder_date() {
		return order_date;
	}


	public void setOrder_date(LocalDateTime order_date) {
		this.order_date = order_date;
	}


	public Long getOrder_total_Price() {
		return order_total_Price;
	}


	public void setOrder_total_Price(Long order_total_Price) {
		this.order_total_Price = order_total_Price;
	}


	public String getOrder_items() {
		return order_items;
	}


	public void setOrder_items(String order_items) {
		this.order_items = order_items;
	}


	public String getPayment_type() {
		return payment_type;
	}


	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}


	public List<ProductEntity> getProductEntity() {
		return productEntity;
	}


	public void setProductEntity(List<ProductEntity> productEntity) {
		this.productEntity = productEntity;
	}


	@Override
	public String toString() {
		return "OrdersEntity [id=" + id + ", order_date=" + order_date + ", order_total_Price=" + order_total_Price
				+ ", order_items=" + order_items + ", payment_type=" + payment_type + ", productEntity=" + productEntity
				+ "]";
	}
	
	
	
	
	
	
	
	
}
