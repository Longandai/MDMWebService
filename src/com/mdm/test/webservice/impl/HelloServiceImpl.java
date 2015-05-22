package com.mdm.test.webservice.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.mdm.test.bean.InputBean;
import com.mdm.test.bean.OutputBean;
import com.mdm.test.webservice.HelloService;

import javax.jws.soap.SOAPBinding.Style; 
@WebService(endpointInterface="com.mdm.test.webservice.HelloService" ,serviceName="HelloService")
@SOAPBinding(style = Style.RPC) 
public class HelloServiceImpl implements HelloService {
	public HelloServiceImpl(){}
	public OutputBean invoke(InputBean bean) {
		// TODO Auto-generated method stub
		OutputBean outputBean = new OutputBean();
		outputBean.setPassword(bean.getPassword());
		outputBean.setUserName(bean.getUserName());
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		outputBean.setResult(list);
		return outputBean;
	}

}
