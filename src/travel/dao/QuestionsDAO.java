package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class QuestionsDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private QuestionsDAO() {
		// TODO Auto-generated constructor stub
	}

	private static QuestionsDAO dao = new QuestionsDAO();

	public static QuestionsDAO getInstance() {
		return dao;
	}
	
	
	
}
