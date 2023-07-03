package com.swp.vnhistory.dto.request;

public class UpdateBlogForm {

	private long blogId;
	private String content;
	public long getBlogId() {
		return blogId;
	}
	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public UpdateBlogForm(long blogId, String content) {
		super();
		this.blogId = blogId;
		this.content = content;
	}
	public UpdateBlogForm() {
		super();
	}
	
	
}
