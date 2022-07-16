package com.beloil.spring.model;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text {
	
	private  int textId;
	private Date publishDate;
	private String textContent;
		
	public Text() {
		super();
	}	
	
	public Text(int textId, Date publishDate, String textContent) {
		super();
		this.textId = textId;
		this.publishDate = publishDate;
		this.textContent = textContent;
	}

	public int getTextId() {
		return textId;
	}
	public void setTextId(int textId) {
		this.textId = textId;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getTextContent() {
		return textContent;
	}
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	
	public String getPublishDateAsString() {
		Format formatter = new SimpleDateFormat("dd-MM-yyyy");
		return formatter.format(this.publishDate);
	}

	@Override
	public String toString() {
		return "Text [textId=" + textId + ", publishDate=" + publishDate + ", textContent=" + textContent + "]";
	}
	
	
}
