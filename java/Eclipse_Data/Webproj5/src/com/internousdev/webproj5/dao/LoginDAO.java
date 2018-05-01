package com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj5.dto.LoginDTO;
import com.internousdev.webproj5.util.DBConnector;
import com.mysql.jdbc.PreparedStatement;

public class LoginDAO {

	public String username;
	public String password;

	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public List<LoginDTO> select(String username,String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from user_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1. username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()){
				LoginDTO dto=new LoginDTO();
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}
		}
	}

}