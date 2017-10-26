package com.example.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewBean {

	@Autowired
	private MyInterface myInterface;
	
	@Value("This is my default value assinged from @Value ")
	private String testValue;
	
	
	public void test(){
		System.out.println(myInterface.getName());
		System.out.println(testValue);
System.out.println("sravan");
	}
}
