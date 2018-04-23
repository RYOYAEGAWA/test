package com.internousdev.login.dto;

public class LoginDTO {
	private int id;
	private String name;
	private String password;

	public int getId(){  //今回は不要
		return id;
	}

	public void setId(int id){  //今回は不要
		this.id = id;
	}

	public String getName(){  //DAO 25行目の情報が入る
		return name;  //フィールド変数へ更新
	}
	public void setName(String name){  //今回は不要
		this.name = name;
	}

	public String getPassword(){  //DAO 26行目の情報が入る
		return password;  //フィールド変数へ更新
	}

	public void setPassword(String password){  //今回は不要
		this.password = password;
	}

}
