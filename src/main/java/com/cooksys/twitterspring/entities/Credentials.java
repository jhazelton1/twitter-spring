package com.cooksys.twitterspring.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Credentials {
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String password;
	
	public Credentials () {
		
	}

	public Credentials(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	

}
