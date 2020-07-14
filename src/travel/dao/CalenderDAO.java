package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CalenderDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private CalenderDAO() {
		// TODO Auto-generated constructor stub
	}

	private static CalenderDAO dao = new CalenderDAO();

	public static CalenderDAO getInstance() {
		return dao;
	}
	
	
	
}
