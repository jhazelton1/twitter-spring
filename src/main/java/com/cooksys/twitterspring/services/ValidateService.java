package com.cooksys.twitterspring.services;

import org.springframework.stereotype.Service;

import com.cooksys.twitterspring.repositories.HashtagRepository;
import com.cooksys.twitterspring.repositories.UserRepository;


@Service
public class ValidateService {
	
	private HashtagRepository hRepo;
	private UserRepository uRepo;
	
	public ValidateService(HashtagRepository hRepo, UserRepository uRepo) {
		this.hRepo = hRepo;
		this.uRepo = uRepo;
	}
	
	public boolean isTag(String label) {
		return hRepo.findByLabel(label).getLabel().equals(label);
	}
	
	public boolean isUsername(String username) {
		return uRepo.findUserByCredentialsUserName(username).getCredientials().getUsername().equals(username);
	}
	
	public boolean isUsernameAvailable(String username) {
		return !uRepo.findUserByCredentialsUserName(username).getCredientials().getUsername().equals(username);
	}
	
	
}
