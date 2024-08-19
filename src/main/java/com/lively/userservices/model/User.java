package com.lively.userservices.model;

import java.util.List;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class User implements ConnectionEntity{
	@Id
    private String userName;
	@Temporal(TemporalType.DATE)
    private Date dob;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Location curLocation;
	@OneToMany(mappedBy = "friend", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> friends;
    private List<ConnectionRequest> connectionConnectionRequests;
    private List<ConnectionRequest> pendingConnectionConnectionRequests;
    private List<Group> groups;
    private List<ConnectionRequest> pendingGroupConnectionRequests;
    private String passwordHash;
    private List<String> interests;
    private String aboutDescription;
    private String interestedDescription;
    private List<Post> posts;
    private List<Interest> receivedInterests;
    private List<Interest> sentInterests;

    public ConnectionRequest addConnectionConnectionRequest(ConnectionEntity entity) {
        // Implementation here
        return null;
    }

    public void showInterest(User user, String interestType) {
        // Implementation here
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
