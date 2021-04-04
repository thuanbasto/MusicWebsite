package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.converter.UserConverter;
import com.dto.UserDTO;
import com.entity.User;
import com.repository.UserRepositoty;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepositoty userRepositoty;

	@Autowired
	UserConverter userConverter;

	@Override
	public List<UserDTO> getUsers() {
		List<User> users = userRepositoty.findAll();
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		users.forEach(user -> userDTOs.add(userConverter.toDTO(user)));
		return userDTOs;
	}

}
