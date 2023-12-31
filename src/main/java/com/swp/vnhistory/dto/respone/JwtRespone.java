package com.swp.vnhistory.dto.respone;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class JwtRespone {


	private UserForm user;
	
	
	private String type = "Bearer";
	String token;
	String refreshToken;
	public UserForm getUser() {
		return user;
	}
	public void setUser(UserForm user) {
		this.user = user;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public JwtRespone(UserForm user, String token, String refreshToken) {
		super();
		this.user = user;
//		this.type = type;
		this.token = token;
		this.refreshToken = refreshToken;
	}
	public JwtRespone() {
		super();
	}

	
	
}
