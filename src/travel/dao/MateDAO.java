package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MateDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private MateDAO() {
		// TODO Auto-generated constructor stub
	}

	private static MateDAO dao = new MateDAO();

	public static MateDAO getInstance() {
		return dao;
	}
	
	
	
}
