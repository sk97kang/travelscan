package travel.dto;

public class CostDTO {
	private int CostId;
	private int UserId;
	private String title;
	private int price;
	private String content;

	public CostDTO() {
	}

	public CostDTO(int costId, int userId, String title, int price, String content) {
		super();
		CostId = costId;
		UserId = userId;
		this.title = title;
		this.price = price;
		this.content = content;
	}

	public int getCostId() {
		return CostId;
	}

	public void setCostId(int costId) {
		CostId = costId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
