package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CategoriesDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private CategoriesDAO() {
		// TODO Auto-generated constructor stub
	}

	private static CategoriesDAO dao = new CategoriesDAO();

	public static CategoriesDAO getInstance() {
		return dao;
	}
	
	
	
}
