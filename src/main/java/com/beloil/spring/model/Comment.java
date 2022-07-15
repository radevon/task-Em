package com.beloil.spring.model;

import java.util.Date;

public class Comment {
	private  int commentId;
	private User user;
	private int textId;
	private String commentText;
	private Date dateAt;
	
		
	
	public Comment() {
		super();
	}
	
	public Comment(int commentId, int textId, String commentText, Date dateAt, User user) {
		super();
		this.commentId = commentId;
		this.textId = textId;
		this.commentText = commentText;
		this.dateAt = dateAt;
		this.user=user;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	
	public int getTextId() {
		return textId;
	}
	public void setTextId(int textId) {
		this.textId = textId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public Date getDateAt() {
		return dateAt;
	}
	public void setDateAt(Date dateAt) {
		this.dateAt = dateAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", user=" + user + ", textId=" + textId
				+ ", commentText=" + commentText + ", dateAt=" + dateAt + "]";
	}
	
	
}
