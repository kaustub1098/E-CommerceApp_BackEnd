package com.ecommerce.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.repository.entities.OrdersEntity;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Integer>{

}
