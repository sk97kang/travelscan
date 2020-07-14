package travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import templatedbcp.DbcpTemplate;
import travel.dto.UsersDTO;

public class UsersDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private UsersDAO() {
		// TODO Auto-generated constructor stub
	}

	private static UsersDAO dao = new UsersDAO();

	public static UsersDAO getInstance() {
		return dao;
	}
	
	public List<UsersDTO> searchAll() {
		List<UsersDTO> aList = new ArrayList<UsersDTO>();
		
		try {
			conn = DbcpTemplate.getInit();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM users";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				UsersDTO dto = new UsersDTO();
				dto.setUserId(rs.getInt("userId"));
				dto.setEmail(rs.getString("email"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setGender(rs.getString("gender"));
				dto.setPhone(rs.getInt("phone"));
				dto.setAge(rs.getInt("age"));
				dto.setAdmin(rs.getInt("admin"));
				dto.setCharacter(rs.getString("character"));
				dto.setImage(rs.getString("image"));
				dto.setInstagramId(rs.getString("instagramId"));
				dto.setFacebookId(rs.getString("facebookId"));
				dto.setTwitterId(rs.getString("twitterId"));
				aList.add(dto);
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		} finally {
			DbcpTemplate.close(rs);
			DbcpTemplate.close(stmt);
			DbcpTemplate.close(pstmt);
			DbcpTemplate.close(conn);
		}
		
		return aList;
	}
	
	
}
