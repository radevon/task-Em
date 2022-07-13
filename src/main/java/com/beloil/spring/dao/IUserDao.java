package com.beloil.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.beloil.spring.model.User;

@Repository
public interface IUserDao {
	
	void addUser(User user);

    void deleteUser(int id);

    void updateInfo(User user);

    List<User> queryAll();

    User getById(int id);
    
    User getByName(String userName);
}
