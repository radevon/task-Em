package com.beloil.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.beloil.spring.model.User;
import com.beloil.spring.service.UserService;

@Service
public class UserServiceSecurity implements UserDetailsService {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userService.getByName(username);
	}

	
	public boolean createUser(User user) {
		 User userFromDB = userService.getByName(user.getUserName());
         if (userFromDB != null) {
	         return false;
	     }
         user.setPasswordHash(encoder.encode(user.getPassword()));
	     return userService.add(user)>0;
	}
	
	 public boolean deleteUser(int userId) {
	        return userService.delete(userId)>0;
	    }
}
