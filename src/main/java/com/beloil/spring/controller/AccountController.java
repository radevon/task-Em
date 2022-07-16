package com.beloil.spring.controller;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.beloil.spring.model.User;
import com.beloil.spring.service.IUserService;


@Controller
public class AccountController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	// Заготовка без jwt. И пароль пока не шифрую. Для демонстрации функционала логирования с простейшим пока использованием куки.
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String signIn(@RequestParam(value="userName") String userName,@RequestParam(value="password") String password, HttpServletResponse response) {
		try {
				User logedUser=userService.getByName(userName,password);
				if(logedUser!=null)
				{
					Cookie cookie = new Cookie("auth", String.valueOf(logedUser.getUserId()));//создаем объект Cookie,
				     //в конструкторе указываем значения для name и value
				     cookie.setPath("/spring");//устанавливаем путь
				     cookie.setMaxAge(3600);
				     response.addCookie(cookie);
					return "redirect:/";		
				}else
				{
					return "redirect:/login";	
				}
				
		}
		catch(Exception e) {
			
			return "redirect:/login";		
		}
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView signOut(HttpServletResponse response) {
		Cookie logout = new Cookie("auth", null);
		logout.setMaxAge(0);
		response.addCookie(logout);
		return new ModelAndView("redirect:/login");		
	}
}
