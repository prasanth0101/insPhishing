package com.example.demo.requestDto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequest {
	private String username;
	private String password;
}
