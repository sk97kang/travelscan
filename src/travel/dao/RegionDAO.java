package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegionDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private RegionDAO() {
		// TODO Auto-generated constructor stub
	}

	private static RegionDAO dao = new RegionDAO();

	public static RegionDAO getInstance() {
		return dao;
	}
	
	
	
}
