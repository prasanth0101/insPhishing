package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.InsUser;

public interface UserRepo extends JpaRepository<InsUser, Integer>{
	
}
