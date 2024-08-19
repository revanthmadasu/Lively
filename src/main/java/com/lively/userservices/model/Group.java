package com.lively.userservices.model;

import java.util.Date;
import java.util.List;
public class Group implements ConnectionEntity {
    private String groupName;
    private String groupId;
    private List<User> members;
    private List<User> admins;
    private List<ConnectionRequest> pendingRequests;
    private List<String> interests;
    private Date createDate;
    private String aboutDescription;
    private List<Post> posts;
    
    public Group(String groupName, String groupId, List<User> members, List<User> admins,
			List<ConnectionRequest> pendingRequests, List<String> interests, Date createDate, String aboutDescription,
			List<Post> posts) {
		super();
		this.groupName = groupName;
		this.groupId = groupId;
		this.members = members;
		this.admins = admins;
		this.pendingRequests = pendingRequests;
		this.interests = interests;
		this.createDate = createDate;
		this.aboutDescription = aboutDescription;
		this.posts = posts;
	}

	public boolean makePost(Post post) {
        // Implementation here
        return false;
    }

    public boolean isAuthorized(User user) {
        // Implementation here
        return false;
    }

    public List<User> getConnections() {
        // Implementation here
        return null;
    }

    public boolean acceptRequest(ConnectionRequest request) {
        // Implementation here
        return false;
    }
}
