package com.mdm.test.bean;

import java.io.Serializable;

public class InputBean  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1080012398123L;
	private String userName;
	private String password;
	public InputBean(){
		
	}
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
}
