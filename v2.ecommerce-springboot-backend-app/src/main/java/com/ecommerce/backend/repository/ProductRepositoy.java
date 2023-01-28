package com.ecommerce.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.repository.entities.ProductEntity;

public interface ProductRepositoy extends JpaRepository<ProductEntity, Integer> {

}
