package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.requestDto.UserRequest;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/ins")
@CrossOrigin
public class UserController {
	
	
	@Autowired
	private UserService service;
	@CrossOrigin
	@PostMapping("/post")
	public ResponseEntity  insert(@RequestBody UserRequest user) {
		service.put(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
