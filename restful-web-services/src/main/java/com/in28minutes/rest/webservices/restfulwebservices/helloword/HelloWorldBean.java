package com.in28minutes.rest.webservices.restfulwebservices.helloword;

import org.springframework.stereotype.Component;


public class HelloWorldBean {
	private String message;
	 
	public HelloWorldBean(String message) {
		this.message = message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}	 
}
