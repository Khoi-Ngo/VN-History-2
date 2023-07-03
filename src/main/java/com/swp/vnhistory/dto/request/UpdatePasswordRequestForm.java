package com.swp.vnhistory.dto.request;

public class UpdatePasswordRequestForm {
	private long userId;
//	private String oldPass;
	private String newPass;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public UpdatePasswordRequestForm(long userId, String newPass) {
		super();
		this.userId = userId;

		this.newPass = newPass;
	}

	public UpdatePasswordRequestForm() {
		super();
	}

}
