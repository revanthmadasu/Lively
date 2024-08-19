package com.lively.userservices.model;

import java.util.Date;

public class Post {
	private ConnectionEntity connectionEntity;
    private User user;
    private Content content;
    private Date date;
	public Post(ConnectionEntity connectionEntity, User user, Content content, Date date) {
		super();
		this.connectionEntity = connectionEntity;
		this.user = user;
		this.content = content;
		this.date = date;
	}
	public ConnectionEntity getConnectionEntity() {
		return connectionEntity;
	}
	public void setConnectionEntity(ConnectionEntity connectionEntity) {
		this.connectionEntity = connectionEntity;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
