package com.SCA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Profile {
	
	
	@Id
	private String email;
	
	private String username;
	
	private String password;
	
	private String role;

	@Override
	public String toString() {
		return "Profile [email=" + email + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}

	public Profile(String email, String username, String password, String role) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
	

}
