package com.ecommerce.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.backend.repository.entities.UsersEntity;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {

}
