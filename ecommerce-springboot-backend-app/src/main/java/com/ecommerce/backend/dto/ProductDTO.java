package com.ecommerce.backend.dto;

import lombok.Data;

@Data
public class ProductDTO {

		private Integer id;
		
		private String product_name;
		
		private String product_description;
		
		private Integer product_price;
		
		private Integer product_stock_quantity;
		
		private Integer category_id;
		
		private Integer discount_id;
		
		private Integer order_id;
		
	
		
		

}
