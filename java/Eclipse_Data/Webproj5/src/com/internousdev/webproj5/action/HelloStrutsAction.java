package com.internousdev.webproj5.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.webproj5.dao.HelloStrutsDAO;
import com.internousdev.webproj5.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport implements SessionAware {
//以下の２つの違いがわからない
	private List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();
	private Map<String, Object> session;

	public String execute() {
		String ret = ERROR;
		HelloStrutsDAO dao=new HelloStrutsDAO();

		helloStrutsDTOList=dao.select();

		if (helloStrutsDTOList.size() > 0) {  //情報の個数取得
			session.put("helloStrutsDTOList", helloStrutsDTOList); //←なにしてる？
			ret = SUCCESS;
		}else{
			ret = ERROR;
		}
		return ret;
	}

	public Map<String, Object> getSession() {  //よくわからない
		return session;
	}

	public void setSession(Map<String, Object> session){  //よくわからない
		this.session = session;
	}

}
