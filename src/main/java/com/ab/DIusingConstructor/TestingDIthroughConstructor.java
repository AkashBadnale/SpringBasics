package com.ab.DIusingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ab.DIusingProperty.Student;

public class TestingDIthroughConstructor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext   context  = new ClassPathXmlApplicationContext("application2.properties.xml");
		Student st1 = (Student) context.getBean("student1");
		System.out.println(st1);
		Student st2 = (Student) context.getBean("student2");
		System.out.println(st2);
	}//main
}//TestingDIthroughConstructor
