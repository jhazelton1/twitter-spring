package com.cooksys.twitterspring.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.context.annotation.Profile;

@Entity
@Table(name = "users")
public class User {

	Date date = new Date();

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@Column(name = "username")
	private String username;

	@Embedded
	private Profile profile;

	@Embedded
	private Credentials credientials;

	@Embedded
	private final Timestamp joined = new Timestamp(date.getTime());

	public User() {

	}

	public User(Integer id, Profile profile, Credentials credentials) {
		this.id = id;
		this.profile = profile;
		this.credientials = credentials;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Credentials getCredientials() {
		return credientials;
	}

	public void setCredientials(Credentials credientials) {
		this.credientials = credientials;
	}
	
	

}
