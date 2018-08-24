package com.cooksys.twitterspring.services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cooksys.twitterspring.dtos.UserDto;
import com.cooksys.twitterspring.entities.User;
import com.cooksys.twitterspring.mappers.UserMapper;
import com.cooksys.twitterspring.repositories.UserRepository;

@Service
public class UserService {
	
	private UserRepository uRepo;
	private UserMapper uMapper;
	
	public UserService(UserRepository uRepo, UserMapper uMapper) {
		this.uRepo = uRepo;
		this.uMapper = uMapper;
	}

	public Collection<UserDto> getUsers() {
		return this.uMapper.toDtos(this.uRepo.findAll());
	}

	@Transactional
	public UserDto addUser(UserDto u) {
		User entity = uMapper.fromDto(u);
		uRepo.save(entity);
		return u;
	}
	
}
