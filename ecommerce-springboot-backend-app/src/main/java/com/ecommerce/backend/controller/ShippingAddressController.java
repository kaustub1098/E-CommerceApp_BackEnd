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

import com.ecommerce.backend.dto.ShippingAddressDTO;
import com.ecommerce.backend.services.ShippingAddressService;

@RestController
@RequestMapping("/api/v1")
public class ShippingAddressController {
	
	private ShippingAddressService shippingAddressService;
	
	
	public ShippingAddressController(@Autowired ShippingAddressService shippingAddressService) {
		this.shippingAddressService=shippingAddressService;
	}
	
	@GetMapping("/shippingAddress")
	public ResponseEntity<List<ShippingAddressDTO>> getShippingAddress(){
		List<ShippingAddressDTO> list =this.shippingAddressService.findAll();
		return new ResponseEntity<List<ShippingAddressDTO>>(list,HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/shippingAddress",consumes = "application/json",produces = "application/json")
	public ResponseEntity<ShippingAddressDTO>saveShipppingAddress(@RequestBody ShippingAddressDTO address){
		
		ShippingAddressDTO returnedShippingAddressDTO =this.shippingAddressService.saveAddressDTO(address);
		return new ResponseEntity<ShippingAddressDTO>(returnedShippingAddressDTO, HttpStatus.CREATED);
		
	}
	
	

	
	
	
	
	
	
}