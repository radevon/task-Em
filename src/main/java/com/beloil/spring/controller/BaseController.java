package com.beloil.spring.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beloil.spring.model.Text;

import com.beloil.spring.service.ITextService;


@Controller
public class BaseController {
	

	@Autowired
	private ITextService textService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(Model model, Principal principal) {
		List<Text> texts=textService.getAll();
		model.addAttribute("texts", texts);
		model.addAttribute("auth",principal);
		return "index";
	}
	
	
}
