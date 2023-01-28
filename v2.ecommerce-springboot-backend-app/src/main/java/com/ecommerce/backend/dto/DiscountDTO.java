package com.ecommerce.backend.dto;




public class DiscountDTO {

	private Integer id;
	
	private Integer discount_price;
	
	private String discount_description;
	
	
	public DiscountDTO() {
		// TODO Auto-generated constructor stub
	}


	public DiscountDTO(Integer id, Integer discount_price, String discount_description) {
	
		this.id = id;
		this.discount_price = discount_price;
		this.discount_description = discount_description;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getDiscount_price() {
		return discount_price;
	}


	public void setDiscount_price(Integer discount_price) {
		this.discount_price = discount_price;
	}


	public String getDiscount_description() {
		return discount_description;
	}


	public void setDiscount_description(String discount_description) {
		this.discount_description = discount_description;
	}


	@Override
	public String toString() {
		return "DiscountDTO [id=" + id + ", discount_price=" + discount_price + ", discount_description="
				+ discount_description + "]";
	}
	
	
	
}

