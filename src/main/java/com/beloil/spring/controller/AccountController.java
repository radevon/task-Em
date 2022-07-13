package com.beloil.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView signIn() {
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView signOut() {
		return new ModelAndView("redirect:/login");		
	}
}
