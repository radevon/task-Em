package com.beloil.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.beloil.spring.model.Comment;
import com.beloil.spring.service.ICommentService;


@RestController
public class CommentApiController {
	
	@Autowired
	private ICommentService commentService;

	
	@RequestMapping(value="/api/comments/{textId}",method=RequestMethod.GET)
	@ResponseBody
	public List<Comment> getCommentsOfText(@PathVariable("textId") int textId) {		
		return commentService.getByTextId(textId);
	}
	
	
	@RequestMapping(value="/api/comment",method=RequestMethod.POST)
	@ResponseBody
	public int addComment(@RequestBody Comment comment) {		
		commentService.add(comment);
		return comment.getCommentId();
	}
	
	
	
	@RequestMapping(value="/api/comment/{commentId}",method=RequestMethod.DELETE)
	@ResponseBody
	public int deleteComment(@PathVariable("commentId") int commentId) {		
		return commentService.delete(commentId);
	}
}
