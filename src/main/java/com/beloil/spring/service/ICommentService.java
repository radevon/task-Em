package com.beloil.spring.service;

import java.util.List;

import com.beloil.spring.model.Comment;



public interface ICommentService {
	int add(Comment entity);

    int delete(int id);

    List<Comment> getAll();

    Comment getById(int id);
    
    List<Comment> getByTextId(int id);
}
