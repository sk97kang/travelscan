package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MediasDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private MediasDAO() {
		// TODO Auto-generated constructor stub
	}

	private static MediasDAO dao = new MediasDAO();

	public static MediasDAO getInstance() {
		return dao;
	}
	
	
	
}
