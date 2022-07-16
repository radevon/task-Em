package com.beloil.spring.controller;

import java.util.List;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beloil.spring.model.Text;

import com.beloil.spring.service.ITextService;


@Controller
public class BaseController {
	

	@Autowired
	private ITextService textService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(@CookieValue(value = "auth", required = false) Cookie cookieName, Model model) {
		if(cookieName==null) {
			return "redirect:/login";
		}
		List<Text> texts=textService.getAll();
		model.addAttribute("texts", texts);
		return "index";
	}
	
	
}
