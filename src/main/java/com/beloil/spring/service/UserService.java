package com.beloil.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beloil.spring.dao.IUserDao;
import com.beloil.spring.model.User;

@Service("userService")
public class UserService implements IUserService {
	
	@Autowired
	private IUserDao userDao;

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(id);
	}

	public void updateInfo(User user) {
		// TODO Auto-generated method stub
		userDao.updateInfo(user);
	}

	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return userDao.queryAll();
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
