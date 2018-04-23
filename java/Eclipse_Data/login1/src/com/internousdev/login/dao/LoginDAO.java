package com.internousdev.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {
	public LoginDTO select(String name,String password) throws SQLException{
		LoginDTO dto=new LoginDTO();        //DTOをインスタンス化
		DBConnector db=new DBConnector();   //DBConnectorをインスタンス化
		Connection con = db.getConnection();//DBConnectorクラスでのMySQLログイン情報等をconへ代入
		String sql="select * from user where user_name=? and password=?";  //SQLへほしい情報を宣言

	try{
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1, name);       //SQLから得たい情報の型を指定
		ps.setString(2, password);   //SQLから得たい情報の型を指定
		ResultSet rs=ps.executeQuery();  //実行(executeQuery)し、結果を取得

		if(rs.next()){
			dto.setName(rs.getString("user_name"));     //DTOへSQLから取得情報を更新してる
			dto.setPassword(rs.getString("password"));  //DTOへSQLから取得情報を更新してる
		}
	}catch (SQLException e){  //例外処理
		e.printStackTrace();

	}finally {


		con.close();  //SQL disconnect
	}
		return dto;  //LoginDTOへ情報を返す
	}

}
