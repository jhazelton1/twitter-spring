package com.cooksys.twitterspring.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "users")
public class User {

	@Transient
	Date date = new Date();

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@Embedded
	private Credentials credentials;

	@Embedded
	private Profile profile;

	@JsonFormat(pattern = "yyyy-MM-dd")

	private Timestamp joined;

	public User() {

	}

	public User(Integer id, Profile profile, Credentials credentials) {
		this.id = id;
		this.profile = profile;
		this.credentials = credentials;
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
		return credentials;
	}

	public void setCredientials(Credentials credentials) {
		this.credentials = credentials;
	}

}
