package com.ecommerce.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.backend.entities.OrdersEntity;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Integer> {

	@Query("SELECT e from OrdersEntity e where e.order_items=?1")
	public List<OrdersEntity> showOrdersByProductName(String name);
	
	
	
}
