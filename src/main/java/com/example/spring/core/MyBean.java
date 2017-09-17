package com.example.spring.core;

import org.springframework.stereotype.Component;

@Component("testName")
public class MyBean implements MyInterface {
	
	public MyBean(){
		System.out.println("MyBean......");
	}

	@Override
	public String getName() {
		return "Welcome to Annotation World";
	}

}
