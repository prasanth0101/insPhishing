package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InsUser;
import com.example.demo.repo.UserRepo;
import com.example.demo.requestDto.UserRequest;

@Service
public class UserService {
		
	@Autowired
	private UserRepo repo;
	
	private InsUser toInsUser(UserRequest user) {
			return new InsUser().builder()
					.username(user.getUsername())
					.password(user.getPassword()).build();
					
	}
	
	
	
	public void put(UserRequest user) {
		
		
		repo.save(toInsUser(user));
	}
	
}
