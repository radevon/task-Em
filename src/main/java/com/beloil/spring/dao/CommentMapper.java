package com.beloil.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.beloil.spring.model.Comment;


@Repository
public interface CommentMapper {
	int add(Comment entity);
    int delete(int id);
    //int update(Comment entity);  // обновления комментариев не предусмотрено логикой приложения
    List<Comment> getAll();
    Comment getById(int id);
    List<Comment> getByTextId(int id);
}
