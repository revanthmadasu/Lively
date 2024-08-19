package com.lively.userservices.model;

import java.util.List;
public interface ConnectionEntity {
	public boolean isAuthorized(User user);
	public boolean acceptRequest(ConnectionRequest connectionRequest);
    public List<User> getConnections();
    public boolean makePost(Post post);
}
