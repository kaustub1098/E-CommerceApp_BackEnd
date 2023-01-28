package com.ecommerce.backend.dto;

import java.time.LocalDateTime;

import lombok.Data;


public class OrdersDTO {

	private Integer id;
	
	private LocalDateTime order_date;
	
	private Long order_total_Price;
	
	private String order_items;
	
	private String payment_type;
	
	
	public OrdersDTO() {
		// TODO Auto-generated constructor stub
	}


	public OrdersDTO(Integer id, LocalDateTime order_date, Long order_total_Price, String order_items,
			String payment_type) {
		super();
		this.id = id;
		this.order_date = order_date;
		this.order_total_Price = order_total_Price;
		this.order_items = order_items;
		this.payment_type = payment_type;
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


	@Override
	public String toString() {
		return "OrdersDTO [id=" + id + ", order_date=" + order_date + ", order_total_Price=" + order_total_Price
				+ ", order_items=" + order_items + ", payment_type=" + payment_type + "]";
	}
	
	
	
}
