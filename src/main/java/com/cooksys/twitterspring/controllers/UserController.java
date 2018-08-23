package com.cooksys.twitterspring.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.twitterspring.dtos.UserDto;
import com.cooksys.twitterspring.entities.User;
import com.cooksys.twitterspring.mappers.UserMapper;
import com.cooksys.twitterspring.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	private UserService uService;
	private UserMapper uMapper;
	
	
	public UserController(UserService uService, UserMapper uMapper) {
		this.uService = uService;
		this.uMapper = uMapper;
	}
	
	@GetMapping
	public Collection<UserDto> getUser() {
		return this.uService.getUsers();
	}
	
	@PostMapping
	public User addUser(@RequestBody UserDto u) {
		return this.uService.addUser(this.uMapper.fromDto(u));
	}

}
