package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CostDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private CostDAO() {
		// TODO Auto-generated constructor stub
	}

	private static CostDAO dao = new CostDAO();

	public static CostDAO getInstance() {
		return dao;
	}
	
	
	
}
