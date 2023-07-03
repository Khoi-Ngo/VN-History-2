package com.swp.vnhistory.dto.request;

public class VoteBlogForm {

	private long userId;
	private long blogId;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getBlogId() {
		return blogId;
	}
	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}
	public VoteBlogForm() {
		super();
	}
	public VoteBlogForm(long userId, long blogId) {
		super();
		this.userId = userId;
		this.blogId = blogId;
	}

	
	
}
