package com.ecommerce.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.repository.entities.ShippingAddressEntity;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddressEntity, Integer> {

}
