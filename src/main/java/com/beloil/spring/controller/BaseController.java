package com.beloil.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beloil.spring.model.User;
import com.beloil.spring.service.IUserService;

@Controller
public class BaseController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/apiaa/users",method=RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAll();
	}
}
