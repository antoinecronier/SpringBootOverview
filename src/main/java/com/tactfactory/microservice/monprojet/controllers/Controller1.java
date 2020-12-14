package com.tactfactory.microservice.monprojet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tactfactory.microservice.monprojet.dtos.UserDto;

@Controller
@RequestMapping("/app1")
public class Controller1 {

	@GetMapping(value = { "/", "/index" })
	public String action1() {
		return "index";
	}

	@PostMapping(value = { "/", "/index" })
	public String action1Post(@RequestParam("firstname") String prenom, String lastname) {
		System.out.println(prenom + " " + lastname);
		return "redirect:index";
	}

	@RequestMapping(value = { "/page1" }, method = { RequestMethod.GET })
	public String action2() {
		return "page1";
	}

	@RequestMapping(value = { "/page1" }, method = { RequestMethod.POST })
	public String action2Post(UserDto dto) {
		System.out.println(dto);
		return "redirect:page1";
	}
}
