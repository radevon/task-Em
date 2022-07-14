package com.beloil.spring.service;

import java.util.List;

import com.beloil.spring.model.Text;


public interface ITextService {
	
	int add(Text entity);

    int delete(int id);

    int update(Text entity);

    List<Text> getAll();

    Text getById(int id);
    
}
