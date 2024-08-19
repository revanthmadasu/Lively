package com.lively.userservices.model;

import java.util.Date;

public class Interest {
    private String interestType;
    private User fromUser;
    private User toUser;
    private Date createDate;
	public Interest(String interestType, User fromUser, User toUser, Date date) {
		super();
		this.interestType = interestType;
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.createDate = date;
	}
	public String getInterestType() {
		return interestType;
	}
	public User getFromUser() {
		return fromUser;
	}
	public User getToUser() {
		return toUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
    
}
