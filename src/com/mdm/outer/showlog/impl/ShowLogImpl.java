package com.mdm.outer.showlog.impl;

import javax.jws.WebService;

import com.mdm.outer.showlog.ShowLog;
@WebService(endpointInterface="com.mdm.outer.showlog.ShowLog",name="showLog")
public class ShowLogImpl implements ShowLog {

	@Override
	public String invoke(String userName) {
		// TODO Auto-generated method stub
		return userName;
	}

}
