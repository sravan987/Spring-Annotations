package com.example.spring.core;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		GenericXmlApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		/*MyInterface inf=	container.getBean("testName",MyBean.class);
		System.out.println(inf.getName());*/
		
		NewBean nb= container.getBean("newBean",NewBean.class);
		nb.test();
	}

}
