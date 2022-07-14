package com.beloil.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.beloil.spring.model.Text;


@Repository
public interface TextMapper {
	int add(Text entity);
    int delete(int id);
    int update(Text entity);
    List<Text> getAll();
    Text getById(int id);
}
