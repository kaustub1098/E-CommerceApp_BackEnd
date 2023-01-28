package com.ecommerce.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.repository.entities.DiscountEntity;


public interface DiscountRepository  extends JpaRepository<DiscountEntity,Integer>{

}
