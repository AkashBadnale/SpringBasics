package com.ab.springDesktopApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingSpringDesktopApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		ApplicationContext   context  = new ClassPathXmlApplicationContext("application.properties.xml");
		Address  addr = (Address) context.getBean("address");
		User usr  = (User) context.getBean("user");
		
		System.out.println(addr);
		System.out.println(usr);
	}//main
}//TestingSpringDesktopApp
