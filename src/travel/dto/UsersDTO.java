package travel.dto;

public class UsersDTO {
	private int userId;
	private String email;
	private String pass;
	private String name;
	private String gender;
	private int phone;
	private int age;
	private int admin;
	private String character;
	private String image;
	private String instagramId;
	private String facebookId;
	private String twitterId;

	public UsersDTO() {
	}

	public UsersDTO(int userId, String email, String pass, String name, String gender, int phone, int age, int admin,
			String character, String image, String instagramId, String facebookId, String twitterId) {
		super();
		this.userId = userId;
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
		this.admin = admin;
		this.character = character;
		this.image = image;
		this.instagramId = instagramId;
		this.facebookId = facebookId;
		this.twitterId = twitterId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public String getCharacter() {
		return character;
	}
	
	public void setCharacter(String character) {
		this.character = character;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getInstagramId() {
		return instagramId;
	}

	public void setInstagramId(String instagramId) {
		this.instagramId = instagramId;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}

}
