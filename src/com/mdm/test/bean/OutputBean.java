package com.mdm.test.bean;

import java.io.Serializable;
import java.util.List;

public class OutputBean  implements Serializable{
	private static final long serialVersionUID = 10129301L;
	private String userName;
	private String password;
	private List<String> result;
	public OutputBean(){}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getResult() {
		return result;
	}
	public void setResult(List<String> result) {
		this.result = result;
	}
	
}
