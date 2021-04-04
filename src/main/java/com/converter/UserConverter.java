package com.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dto.UserDTO;
import com.entity.User;

@Component
public class UserConverter {

	@Autowired
	ModelMapper mapper;

	public User toEntity(UserDTO userDTO) {
		User user = new User();
		return user;
	}

	public UserDTO toDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setUsername(user.getUsername());
		return userDTO;
	}
}
