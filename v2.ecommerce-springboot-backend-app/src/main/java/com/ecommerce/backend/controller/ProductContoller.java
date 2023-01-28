package com.ecommerce.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.backend.dto.ProductDTO;
import com.ecommerce.backend.services.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductContoller {

	
	private ProductService productService;
	public ProductContoller(@Autowired ProductService productService) 
	{
		this.productService=productService;
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDTO>> getEmployee(){
		   List<ProductDTO> list = this.productService.findAll();
	        return new ResponseEntity<List<ProductDTO>>(list,HttpStatus.OK);
		
	}
	
	
	  @PostMapping(value = "/products", consumes = "application/json", produces = "application/json")
	    public ResponseEntity<ProductDTO> createEmployee(@RequestBody ProductDTO product) {
	        // complete the code and return ResponseEnity object with status code 201
	       
	        ProductDTO returnedProductDTO =   this.productService.saveProduct(product);
	        return new ResponseEntity<ProductDTO>(returnedProductDTO, HttpStatus.CREATED);
	    }
	
	
	
}
