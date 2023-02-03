package com.ecommerce.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.backend.dto.UsersDTO;
import com.ecommerce.backend.entities.UsersEntity;
import com.ecommerce.backend.services.UsersService;

@RestController
@RequestMapping("/api/v2")
public class UserController {
	
	private UsersService usersService;
	
	public UserController(@Autowired UsersService userserService) {
		this.usersService=userserService;
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<UsersEntity>>getUsers(){
		List<UsersEntity>list = this.usersService.getUsersList();
		return new ResponseEntity<List<UsersEntity>>(list,HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/users",consumes="application/json",produces = "application/json")
	public ResponseEntity<UsersEntity> createUser (@RequestBody UsersEntity user){
	
		UsersEntity returnedUsersEntity = this.usersService.saveUsers(user);
		return new ResponseEntity<UsersEntity>(returnedUsersEntity,HttpStatus.CREATED);
		
	}
	
	
	
	

}
