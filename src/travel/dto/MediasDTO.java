package travel.dto;

public class MediasDTO {
	private int mediaId;
	private int postId;
	private String url;
	private String comments;

	public MediasDTO() {
	}

	public MediasDTO(int mediaId, int postId, String url, String comments) {
		super();
		this.mediaId = mediaId;
		this.postId = postId;
		this.url = url;
		this.comments = comments;
	}

	public int getMediaId() {
		return mediaId;
	}

	public void setMediaId(int mediaId) {
		this.mediaId = mediaId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
