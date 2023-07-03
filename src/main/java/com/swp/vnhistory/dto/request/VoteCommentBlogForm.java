package com.swp.vnhistory.dto.request;

public class VoteCommentBlogForm {

	private long userId;
	private long commentId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCommentId() {
		return commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

}
