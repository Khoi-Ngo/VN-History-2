package com.swp.vnhistory.dto.request;

public class UpdateEventCommentFormRequest {

	private long eventCommentId;

	public long getEventCommentId() {
		return eventCommentId;
	}

	public void setEventCommentId(long eventCommentId) {
		this.eventCommentId = eventCommentId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private long userId;
	private String content;

}
