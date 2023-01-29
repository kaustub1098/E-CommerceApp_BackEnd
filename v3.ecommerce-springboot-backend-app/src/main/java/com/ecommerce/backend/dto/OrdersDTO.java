package com.ecommerce.backend.dto;

import java.time.LocalDateTime;

import com.ecommerce.backend.repository.entities.ProductEntity;
import com.ecommerce.backend.repository.entities.UsersEntity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class OrdersDTO {

	private Long id;
	
	private LocalDateTime order_date;
	
	private Long order_total_Price;
	
	private String order_items;
	
	private String payment_type;
	
	
	private UsersEntity user_id;
	    	    
	private ProductEntity product_id;
	
	
	
	
}
