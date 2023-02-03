package com.ecommerce.backend.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.backend.entities.UsersEntity;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {
//
//	@Transactional
//	@Modifying
//    @Query("DELETE from UsersEntity e where e.user_firstName=?1")
//	public int deleteUserByName(String name);
	
	
}
