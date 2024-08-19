package com.lively.userservices.model;

public class Content {
	private String textDescription;
	private String media;
	private String mediaType;
	private Post post;
	
    public Content(String textDescription, String media, String mediaType, Post post) {
		super();
		this.textDescription = textDescription;
		this.media = media;
		this.mediaType = mediaType;
		this.post = post;
	}
	public String getTextDescription() {
		return textDescription;
	}
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public Post getPost() {
		return this.post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
}
