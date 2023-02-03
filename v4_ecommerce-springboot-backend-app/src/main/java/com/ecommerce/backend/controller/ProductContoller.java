package com.ecommerce.backend.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.backend.dto.ProductDTO;
import com.ecommerce.backend.entities.ProductCategoryEntity;
import com.ecommerce.backend.entities.ProductEntity;
import com.ecommerce.backend.services.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductContoller {

	
	private ProductService productService;
	public ProductContoller(@Autowired ProductService productService) 
	{
		this.productService=productService;
	}
	
	@CrossOrigin(origins = "http://localhost:4200/")
	@GetMapping("/products")
	public ResponseEntity<List<ProductDTO>> getEmployee(){
		   List<ProductDTO> list = this.productService.findAll();
	        return new ResponseEntity<List<ProductDTO>>(list,HttpStatus.OK);
		
	}
	
	  @CrossOrigin(origins = "http://localhost:4200/")
	  @PostMapping(value = "/products", consumes = "application/json", produces = "application/json")
	    public ResponseEntity<ProductDTO> createEmployee(@RequestBody ProductDTO product) {
	        // complete the code and return ResponseEnity object with status code 201
	       
	        ProductDTO returnedProductDTO =   this.productService.saveProduct(product);
	        return new ResponseEntity<ProductDTO>(returnedProductDTO, HttpStatus.CREATED);
	    }
	
	  @CrossOrigin(origins = "http://localhost:4200/")
	    @GetMapping("/products/name/{name}")
	    public ResponseEntity<List<ProductDTO>> getProductByName(@PathVariable("name") String name)
	    {
	    	List<ProductDTO> listProductDTO=this.productService.getProductByName(name);
	    	return ResponseEntity.ok(listProductDTO);
	    	
	    }
	  
	  
	    
	    @DeleteMapping("/products/{name}")
		public ResponseEntity<List<ProductDTO>> deleteProduct(@PathVariable("name") String productName) 
		{
			//HashMap<String,Boolean> map=new HashMap<String,Boolean>();
	    	List<ProductDTO> listProductDTO=this.productService.getProductByName(productName);
//			List<ProductDTO> productDTO=this.productService.getProductByName(productName);
			
	    	if(listProductDTO !=null)
	    	{
	    		this.productService.deleteProductbyName(productName);
	    	}
	    	else
	    	{
	    		
	    		System.err.println("Cannot found the name of product");
	    		
	    	}
	    	
			
		     

		 

		        return null;
		    }
	  
	  
	  
	  
	  
//	@PostMapping(value="/products", consumes = "application/json", produces = "application/json")
//    public ResponseEntity<ProductEntity> createNewProduct(@RequestBody ProductEntity product) {
//        ProductEntity newProduct = this.productService.saveProduct(product);
//        return new ResponseEntity<ProductEntity>(newProduct, HttpStatus.CREATED);     
//        
//	
//	}

	
	
}
