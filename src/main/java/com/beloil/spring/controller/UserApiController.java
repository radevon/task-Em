package com.beloil.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.beloil.spring.model.User;
import com.beloil.spring.service.IUserService;

@RestController
public class UserApiController {
	
	@Autowired
	private IUserService userService;
	
	
	@RequestMapping(value="/api/users",method=RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUsers() {		
		return userService.getAll();
	}
	
	@RequestMapping(value="/api/user/{userid}",method=RequestMethod.GET)
	@ResponseBody
	public User getUserById(@PathVariable("userid") int userid) {		
		return userService.getById(userid);
	}
	
	@RequestMapping(value="/api/userbyname/{userName}",method=RequestMethod.GET)
	@ResponseBody
	public User getUserByName(@PathVariable("userName") String userName) {		
		return userService.getByName(userName);
	}
	
	@RequestMapping(value="/api/user",method=RequestMethod.POST)
	@ResponseBody
	public int addUser(@RequestBody User user) {		
		userService.add(user);
		return user.getUserId();
	}
	
	@RequestMapping(value="/api/user/{userid}",method=RequestMethod.DELETE)
	@ResponseBody
	public int deleteUser(@PathVariable("userid") int userid) {		
		return userService.delete(userid);
	}
	
	@RequestMapping(value="/api/user",method=RequestMethod.PUT)
	@ResponseBody
	public int updateUser(@RequestBody User user) {		
		return userService.update(user);
	}
}