package travel.dto;

public class MateDTO {
	private int mateId;
	private int userId;
	private String title;
	private String contents;
	private int count;
	private String charater;
	private int liked;

	public MateDTO() {
	}

	public MateDTO(int mateId, int userId, String title, String contents, int count, String charater, int liked) {
		super();
		this.mateId = mateId;
		this.userId = userId;
		this.title = title;
		this.contents = contents;
		this.count = count;
		this.charater = charater;
		this.liked = liked;
	}

	public int getMateId() {
		return mateId;
	}

	public void setMateId(int mateId) {
		this.mateId = mateId;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCharater() {
		return charater;
	}

	public void setCharater(String charater) {
		this.charater = charater;
	}

	public int getLiked() {
		return liked;
	}

	public void setLiked(int liked) {
		this.liked = liked;
	}

}
