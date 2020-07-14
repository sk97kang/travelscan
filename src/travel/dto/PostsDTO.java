package travel.dto;

public class PostsDTO {
	private int postId;
	private int categoryId;
	private int userId;
	private int regionId;
	private String title;
	private String contents;
	private int count;
	private int likes;

	public PostsDTO() {
	}

	public PostsDTO(int postId, int categoryId, int userId, int regionId, String title, String contents, int count,
			int likes) {
		super();
		this.postId = postId;
		this.categoryId = categoryId;
		this.userId = userId;
		this.regionId = regionId;
		this.title = title;
		this.contents = contents;
		this.count = count;
		this.likes = likes;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

}
