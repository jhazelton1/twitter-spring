package com.cooksys.twitterspring.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Profile {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	public Profile() {

	}

	public Profile(String email) {
		this.email = email;
	}

	public Profile(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

}
