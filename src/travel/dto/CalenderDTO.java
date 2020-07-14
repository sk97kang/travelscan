package travel.dto;

import java.util.Date;

public class CalenderDTO {
	private int calenderId;
	private int userId;
	private String title;
	private String contents;
	private Date startDate;
	private Date endDate;

	public CalenderDTO() {
	}

	public CalenderDTO(int calenderId, int userId, String title, String contents, Date startDate, Date endDate) {
		super();
		this.calenderId = calenderId;
		this.userId = userId;
		this.title = title;
		this.contents = contents;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getCalenderId() {
		return calenderId;
	}

	public void setCalenderId(int calenderId) {
		this.calenderId = calenderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
