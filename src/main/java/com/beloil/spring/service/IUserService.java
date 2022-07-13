package com.beloil.spring.service;

import java.util.List;

import com.beloil.spring.model.User;

public interface IUserService {
	
	void addUser(User user);

    void deleteUser(int id);

    void updateInfo(User user);

    List<User> queryAll();

    User getById(int id);
    
    User getByName(String userName);
}
