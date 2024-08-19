package com.lively.userservices.model;

public class Location {
    private String locationCoordinate;
    private int locationPin;
    private String address;
    private Place place;
	public Location(String locationCoordinate, int locationPin, String address, Place place) {
		super();
		this.locationCoordinate = locationCoordinate;
		this.locationPin = locationPin;
		this.address = address;
		this.place = place;
	}
	public String getLocationCoordinate() {
		return locationCoordinate;
	}
	public void setLocationCoordinate(String locationCoordinate) {
		this.locationCoordinate = locationCoordinate;
	}
	public int getLocationPin() {
		return locationPin;
	}
	public void setLocationPin(int locationPin) {
		this.locationPin = locationPin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
    
}
