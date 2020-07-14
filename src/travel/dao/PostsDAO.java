package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostsDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private PostsDAO() {
		// TODO Auto-generated constructor stub
	}

	private static PostsDAO dao = new PostsDAO();

	public static PostsDAO getInstance() {
		return dao;
	}
	
	
	
}
