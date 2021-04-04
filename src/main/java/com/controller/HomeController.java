package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dto.ArtistDTO;
import com.service.ArtistService;
import com.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;

	@Autowired
	ArtistService artistService;

	@GetMapping(value = { "/", "/home" })
	public String homePage(HttpServletRequest request) {
//		List<UserDTO> userDTOs = userService.getUsers();
//		request.setAttribute("user", userDTOs);
		List<ArtistDTO> artistDTOs = artistService.getArtists();
		request.setAttribute("artists", artistDTOs);
		return "Home";
	}
}
