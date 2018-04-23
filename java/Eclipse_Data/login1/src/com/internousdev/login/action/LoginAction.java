package com.internousdev.login.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	/*カプセル化*/
	private String name;      //Login.jspからの得たログイン情報が入ってる
	private String password;  //Login.jspからの得たログイン情報が入ってる
	private Map<String, Object> session;  //DBへログイン情報を送るために必要

	/*executeという変数へ実行内容を入れ込んであげている*/
	public String execute() throws SQLException {
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();  //DAOファイルをインスタンス化
		LoginDTO dto = new LoginDTO();  //DTOファイルをインスタンス化

		dto = dao.select(name,password);  //MySQLの結果
		if(name.equals(dto.getName())){   //上記のログイン情報とMySQLからの結果を照合
			if(password.equals(dto.getPassword())){  //上記のログイン情報とMySQLからの結果を照合
				ret = SUCCESS;
			}
		}
		session.put("name",dto.getName());  //今回は特に活躍してない
		return ret;  //照合しなかった場合、ERROR
	}
	public String getName(){  //25行目の"name"がここを経由してフィールドからログイン情報を取得している。
		return name;
	}
	public void setName(String name){ //今回は不要
		this.name = name;
	}
	public String getPassword(){  //26行目の"name"がここを経由してフィールドからログイン情報を取得している
		return password;
	}
	public void setPassword(String password){ //今回は不要
		this.password = password;
	}
	public Map<String, Object>getSession(){  //DBへログイン情報を送っている
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
