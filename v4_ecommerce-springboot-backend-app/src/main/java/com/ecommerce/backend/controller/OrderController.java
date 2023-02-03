package com.ecommerce.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.backend.dto.OrdersDTO;
import com.ecommerce.backend.entities.OrdersEntity;
import com.ecommerce.backend.services.OrdersService;

@RestController
@RequestMapping("/api/v1")

public class OrderController {

	private OrdersService ordersService;
	
	public OrderController(@Autowired OrdersService ordersService) {
		this.ordersService=ordersService;
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<OrdersEntity>> getOrders(){
		List<OrdersEntity>list = this.ordersService.getOrdersList();
		return new ResponseEntity<List <OrdersEntity>>(list,HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/orders",consumes="application/json",produces ="application/json")
	public ResponseEntity<OrdersEntity> createOrder(@RequestBody OrdersEntity orders){
		
		OrdersEntity returnedorderEntity = this.ordersService.saveOrders(orders);
	    return new ResponseEntity<OrdersEntity>(returnedorderEntity, HttpStatus.CREATED);
	
	}
	
	@GetMapping("/orders/name/{name}")
	public ResponseEntity<List<OrdersEntity>> findOrderByName(@PathVariable("name")String name){
		List<OrdersEntity> ordersListEntity = this.ordersService.getOrderByProductName(name);
		return ResponseEntity.ok(ordersListEntity);
		
	}
	
	
	
}
