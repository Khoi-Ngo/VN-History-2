package com.swp.vnhistory.dto.request;

public class UpdateBlogCommentForm {

	private long userId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	private long blogCommentId;
	private String content;

	public long getBlogCommentId() {
		return blogCommentId;
	}

	public void setBlogCommentId(long blogCommentId) {
		this.blogCommentId = blogCommentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
