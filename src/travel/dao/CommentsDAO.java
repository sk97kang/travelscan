package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CommentsDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private CommentsDAO() {
		// TODO Auto-generated constructor stub
	}

	private static CommentsDAO dao = new CommentsDAO();

	public static CommentsDAO getInstance() {
		return dao;
	}
	
	
	
}
