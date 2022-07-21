package com.beloil.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beloil.spring.dao.UserMapper;
import com.beloil.spring.model.User;

@Service("userService")
public class UserService implements IUserService {
	
	@Autowired
	private UserMapper userDao;
	

	public int add(User entity) {
		// TODO Auto-generated method stub
		return userDao.add(entity);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}

	public int update(User entity) {
		// TODO Auto-generated method stub
		return userDao.update(entity);
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

	public User getByName(String userName) {
		// TODO Auto-generated method stub
		return userDao.getByName(userName);
	}

}
