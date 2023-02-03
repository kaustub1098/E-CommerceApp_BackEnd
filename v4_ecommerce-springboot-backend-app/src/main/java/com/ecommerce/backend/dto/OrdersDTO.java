package com.ecommerce.backend.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;


public class OrdersDTO {

	private Integer id;
	
	private LocalDate order_date;
	
	private LocalTime orderTime;
	
	private Long order_total_Price;
	
	private String order_items;
	
	private String payment_type;

	private ShippingAddressDTO addressDTO;
 
	public OrdersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdersDTO(LocalDate order_date, LocalTime orderTime, Long order_total_Price, String order_items,
			String payment_type, ShippingAddressDTO addressDTO) {
		super();
		this.order_date = order_date;
		this.orderTime = orderTime;
		this.order_total_Price = order_total_Price;
		this.order_items = order_items;
		this.payment_type = payment_type;
		this.addressDTO = addressDTO;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
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

	public ShippingAddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(ShippingAddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	@Override
	public String toString() {
		return "OrdersDTO [id=" + id + ", order_date=" + order_date + ", orderTime=" + orderTime
				+ ", order_total_Price=" + order_total_Price + ", order_items=" + order_items + ", payment_type="
				+ payment_type + ", addressDTO=" + addressDTO + "]";
	}

	

	

	
	
	
	
}
