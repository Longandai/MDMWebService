package com.mdm.test.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mdm.test.bean.InputBean;
import com.mdm.test.bean.OutputBean;
@WebService
public interface HelloService {
	@WebMethod
	public OutputBean invoke(InputBean bean); 
}
