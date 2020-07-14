package travel.dto;

import java.util.Date;

public class CommentsDTO {
	private int comId;
	private int postId;
	private String comments;
	private Date dates;

	public CommentsDTO() {
	}

	public CommentsDTO(int comId, int postId, String comments, Date dates) {
		super();
		this.comId = comId;
		this.postId = postId;
		this.comments = comments;
		this.dates = dates;
	}

	public int getComId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDates() {
		return dates;
	}

	public void setDates(Date dates) {
		this.dates = dates;
	}

}
