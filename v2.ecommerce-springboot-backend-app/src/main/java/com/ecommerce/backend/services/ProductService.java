package com.ecommerce.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.backend.dto.ProductDTO;
import com.ecommerce.backend.repository.ProductRepositoy;
import com.ecommerce.backend.repository.entities.ProductEntity;

@Service
public class ProductService {
	
	private ProductRepositoy productRepository;
	
	public ProductService(@Autowired ProductRepositoy productRepository) {
		
		this.productRepository=productRepository;
		
	}
	
	public ProductDTO saveProduct(ProductDTO product)
	{
		 ModelMapper mapper= new ModelMapper();
		 ProductEntity productEntity=mapper.map(product,ProductEntity.class); 
		 ProductEntity returnedProductEntity=this.productRepository.save(productEntity);
		 ProductDTO returnedProductDTO=mapper.map(returnedProductEntity,ProductDTO.class);
		 return returnedProductDTO;
		 
	}
	
	public List<ProductDTO> findAll()
	{	
		ModelMapper mapper=new ModelMapper();
		Iterable<ProductEntity> listProductEntity=this.productRepository.findAll();
		
		List<ProductDTO> listProductDTO=new ArrayList<>();
		for(ProductEntity productEntity:listProductEntity)
		{
			ProductDTO productDTO=mapper.map(productEntity,ProductDTO.class);
			listProductDTO.add(productDTO);
		}
		
		return listProductDTO;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
