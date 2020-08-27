package com.home.bluesky.beans;

import java.io.Serializable;

public class NewPostUI implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String creator;
	
	private String content;
	
	private String when;

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}
	
	

}
