package com.ecommerce.backend.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrdersDTO {

	private Integer id;
	
	private LocalDateTime order_date;
	
	private Integer order_total_Price;
	
	private String order_items;
	
	private String payment_type;
	
}
