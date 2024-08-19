package com.lively.userservices.model;

public class ConnectionRequest {
    private User requester;
    private ConnectionEntity requestingEntity;
    private String status;

    public ConnectionRequest(User requester, ConnectionEntity requestingEntity, String status) {
		super();
		this.requester = requester;
		this.requestingEntity = requestingEntity;
		this.status = status;
	}

	public User getRequester() {
        return requester;
    }

    public ConnectionEntity getEntity() {
        return requestingEntity;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
