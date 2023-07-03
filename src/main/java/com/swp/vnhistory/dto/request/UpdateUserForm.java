package com.swp.vnhistory.dto.request;

public class UpdateUserForm {

//	String password;

	String userName;
	String userRole;
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	String email;
	Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public UpdateUserForm(Long userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;

		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public UpdateUserForm() {
		super();
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
