package com.ecommerce.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.repository.entities.ProductCategoryEntity;

public interface ProductCategoryRepository  extends JpaRepository<ProductCategoryEntity, Long>{

}
