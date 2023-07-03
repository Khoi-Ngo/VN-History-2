package com.swp.vnhistory.dto.request;

public class UpdateEventForm {

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	private String content;

	public long getDynastyId() {
		return dynastyId;
	}

	public void setDynastyId(long dynastyId) {
		this.dynastyId = dynastyId;
	}

	private String eventName;
	private long dynastyId;
	private long locationId;
	private long eventId;
	private String thumbnail;
	private String image;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
}
