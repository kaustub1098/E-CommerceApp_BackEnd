package com.ecommerce.backend.dto;




public class ProductCategoryDTO {
	
	private String id;
	private String category_name;

	
	public ProductCategoryDTO() {
	// TODO Auto-generated constructor stub
}


	public ProductCategoryDTO(String id, String category_name) {
	
		this.id = id;
		this.category_name = category_name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	@Override
	public String toString() {
		return "ProductCategoryDTO [id=" + id + ", category_name=" + category_name + "]";
	}
	
	
	

}
