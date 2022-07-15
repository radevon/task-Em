package com.beloil.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beloil.spring.dao.CommentMapper;
import com.beloil.spring.model.Comment;

@Service("commentService")
public class CommentService implements ICommentService {

	@Autowired
	private CommentMapper commentDao;
	
	public int add(Comment entity) {
		// TODO Auto-generated method stub
		return commentDao.add(entity);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return commentDao.delete(id);
	}

	public List<Comment> getAll() {
		// TODO Auto-generated method stub
		return commentDao.getAll();
	}

	public Comment getById(int id) {
		// TODO Auto-generated method stub
		return commentDao.getById(id);
	}

	public List<Comment> getByTextId(int id) {
		// TODO Auto-generated method stub
		return commentDao.getByTextId(id);
	}

}
