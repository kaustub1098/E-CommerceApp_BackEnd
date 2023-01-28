package com.ecommerce.backend.dto;




public class ProductDTO {

		private Integer id;
		
		private String product_name;
		
		private String product_description;
		
		private Integer product_price;
		
		private Integer product_stock_quantity;
		
		private Integer category_id;
		
		private Integer discount_id;
		
		private Integer order_id;
		
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Integer id, String product_name, String product_description, Integer product_price,
			Integer product_stock_quantity, Integer category_id, Integer discount_id, Integer order_id) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_price = product_price;
		this.product_stock_quantity = product_stock_quantity;
		this.category_id = category_id;
		this.discount_id = discount_id;
		this.order_id = order_id;
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

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public Integer getDiscount_id() {
		return discount_id;
	}

	public void setDiscount_id(Integer discount_id) {
		this.discount_id = discount_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", product_name=" + product_name + ", product_description="
				+ product_description + ", product_price=" + product_price + ", product_stock_quantity="
				+ product_stock_quantity + ", category_id=" + category_id + ", discount_id=" + discount_id
				+ ", order_id=" + order_id + "]";
	}
	
	
		
		

}
