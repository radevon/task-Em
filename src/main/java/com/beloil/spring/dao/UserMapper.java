package com.beloil.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.beloil.spring.model.User;

@Repository
public interface UserMapper {
	
	int add(User entity);

    int delete(int id);

    int update(User entity);

    List<User> getAll();

    User getById(int id);
    
    User getByName(@Param("userName") String userName, @Param("password") String password);
}
