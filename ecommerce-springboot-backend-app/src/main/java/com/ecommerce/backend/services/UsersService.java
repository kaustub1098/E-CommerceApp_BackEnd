package com.ecommerce.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.backend.dto.UsersDTO;
import com.ecommerce.backend.entities.UsersEntity;
import com.ecommerce.backend.repository.UsersRepository;

@Service
public class UsersService {
	
	private UsersRepository usersRepository;
	
	public UsersService(@Autowired UsersRepository usersRepository) {
		this.usersRepository=usersRepository;
	}
	/*
	public UsersDTO saveUser(UsersDTO users) {
		
		ModelMapper mapper= new ModelMapper();
		UsersEntity usersEntity = mapper.map(users, UsersEntity.class);
		UsersEntity returnedUsersEntity = this.usersRepository.save(usersEntity);
		UsersDTO returneUsersDTO = mapper.map(returnedUsersEntity, UsersDTO.class);
		return returneUsersDTO;
	}
	
	public List<UsersDTO> findAll(){
		
		ModelMapper mapper  = new ModelMapper();
		Iterable<UsersEntity> listUserEntity = this.usersRepository.findAll();
		
		List<UsersDTO>listUsersDTOs= new ArrayList<>();
		for (UsersEntity usersEntity : listUserEntity) {
			System.out.println(usersEntity);
			UsersDTO usersDTO=mapper.map(usersEntity,UsersDTO.class);
			listUsersDTOs.add(usersDTO);
		}
		return listUsersDTOs;
		}
		*/
	
//	public void deleteUserbyName(String name) {
//		this.usersRepository.deleteUserByName(name);
//	}
	
	public List<UsersEntity> getUsersList(){
		List<UsersEntity>listUsersEntity = this.usersRepository.findAll();
		return listUsersEntity;
		
	}
	
	public UsersEntity saveUsers(UsersEntity users) {
		UsersEntity returnedUsersEntity = this.usersRepository.save(users);
		return returnedUsersEntity;
	}
	
	
	

}
