package com.mdm.test;


import javax.xml.ws.Endpoint;

import com.mdm.test.webservice.impl.HelloServiceImpl;

public class Main {
	public static void main(String[] args) {
		System.out.println("Server is starting...");  
		HelloServiceImpl helloService = new HelloServiceImpl();  
	     System.out.println("Server is starting...");  
	        Endpoint.publish("http://localhost:8080/readerService",helloService);  
	        System.out.println("Server is started...");  
        System.out.println("Server is started...");  
	}
}
