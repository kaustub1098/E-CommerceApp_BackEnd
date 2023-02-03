package com.ecommerce.backend.services;

import java.util.ArrayList;
import java.util.List;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import com.ecommerce.backend.dto.OrdersDTO;
import com.ecommerce.backend.entities.OrdersEntity;
import com.ecommerce.backend.repository.OrdersRepository;

@Service
public class OrdersService {

   private OrdersRepository ordersRepository;
   
   
   @Autowired
   public OrdersService( OrdersRepository ordersRepository) {
	   this.ordersRepository=ordersRepository;
	   
   }
   
  /* 
   public List<OrdersDTO> getOrdersList() {
	   ModelMapper mapper = new ModelMapper();
	   OrderDto orderDto = null;
	   Iterable<OrdersEntity>listOrdersEntity =this.ordersRepository.findAll();
	   
	   List<OrdersDTO>listOrderDTO = new ArrayList<OrdersDTO>();
	   
	   for (OrdersEntity ordersEntity : listOrdersEntity) {
		OrdersDTO ordersDTO = mapper.map(ordersEntity, OrdersDTO.class);
		listOrderDTO.add(ordersDTO);
	   }
	   return listOrderDTO;
   }
   
  public OrdersDTO saveOrders(OrdersDTO orders) {
	  
	  ModelMapper mapper = new ModelMapper();
	 //convert dto to entity
	  OrdersEntity ordersEntity = mapper.map(orders, OrdersEntity.class);;
	  //persist entity into DB
	  OrdersEntity returnedOrdersEntity = this.ordersRepository.save(ordersEntity);
	  //convert entity back to DTO to return
	  OrdersDTO returnOrdersDTO = mapper.map(returnedOrdersEntity,OrdersDTO.class);
	  
	  return returnOrdersDTO;
  }
  
  public List<OrdersDTO> getOrderByProductName (String name){
	  
	  List<OrdersEntity> listOrdersEntities = this.ordersRepository.showOrdersByProductName(name);
	  
	  List<OrdersDTO> listOrdersDTOs=new ArrayList<OrdersDTO>();
	  
	  ModelMapper modelMapper= new ModelMapper();
	  
	  for (OrdersEntity ordersEntity : listOrdersEntities) {
		 
		  OrdersDTO tempsDTO = modelMapper.map(ordersEntity, OrdersDTO.class);
		  
		  listOrdersDTOs.add(tempsDTO);
		}
	  return listOrdersDTOs;
  }*/
   public List<OrdersEntity> getOrdersList() {
	
	   List<OrdersEntity>listOrdersEntity =this.ordersRepository.findAll();
	   return listOrdersEntity;
	   
   }
   
   public List<OrdersEntity> getOrderByProductName (String name){
	 List<OrdersEntity> listOrdersEntities = this.ordersRepository.showOrdersByProductName(name);
     return listOrdersEntities;
   }
   
   
   public OrdersEntity saveOrders(OrdersEntity orders) {
	   OrdersEntity returnedOrdersEntity = this.ordersRepository.save(orders);
	   return returnedOrdersEntity;

   }
   
   
   
		   
}
   
   
   
	
	
	
	
	

