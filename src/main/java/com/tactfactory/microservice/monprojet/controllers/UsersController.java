package com.tactfactory.microservice.monprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tactfactory.microservice.monprojet.dtos.UserDto;
import com.tactfactory.microservice.monprojet.repositories.UserRepository;

@Controller
@RequestMapping("users")
public class UsersController {

	private static final String BASE_TEMPLATE = "users/";
	private static final String BASE_URL = "/users/";
	private static final String REDIRECT = "redirect:";

	@Autowired
	private UserRepository repository;

	@GetMapping(value = {"/","/index"})
	public String index(Model model) {
		model.addAttribute("items", repository.findAll());

		return BASE_TEMPLATE + "index";
	}

	@GetMapping("/create")
	public String createGet() {
		return BASE_TEMPLATE + "create";
	}

	@PostMapping("/create")
	public String createPost(UserDto dto) {
		repository.save(dto.getUser());
		return REDIRECT + BASE_URL + "index";
	}

	public String updateGet() {
		return BASE_TEMPLATE + "update";
	}

	public String updatePost() {
		return REDIRECT + BASE_URL + "index";
	}

	public String deleteGet() {
		return BASE_TEMPLATE + "delete";
	}

	public String deletePost() {
		return REDIRECT + BASE_URL + "index";
	}

}
