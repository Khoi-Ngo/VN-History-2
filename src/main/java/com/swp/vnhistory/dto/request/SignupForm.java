package com.swp.vnhistory.dto.request;

import java.util.Set;

public class SignupForm {

	private String username;
	private String email;
	private String password;
//	private Set<String> roles;
	private String role;

	private String avatar;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public SignupForm() {
		super();
	}

	public SignupForm(String username, String email, String password, String role, String avatar) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.avatar = avatar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}
