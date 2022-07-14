package com.beloil.spring.service;

import java.util.List;

import com.beloil.spring.model.User;

public interface IUserService {
	
	int add(User entity);

    int delete(int id);

    int update(User entity);

    List<User> getAll();

    User getById(int id);
    
    User getByName(String userName);
}
