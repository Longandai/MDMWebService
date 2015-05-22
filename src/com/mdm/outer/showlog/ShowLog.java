package com.mdm.outer.showlog;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ShowLog {
	@WebMethod
		public String invoke(@WebParam(name="userName")String userName);
}
