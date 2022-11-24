package com.luv2code.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemo {
	
	public static void main(String[] args) {
		System.out.println("hello");
	// load the spring configuration file
	ClassPathXmlApplicationContext context = new 
			ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	
	
	// retrieve the bean from spring container
	Coach theCoach = context.getBean("myCoach",Coach.class);
	
	Coach alphaCoach = context.getBean("myCoach",Coach.class);
	
	// check if they are same
	boolean result = (theCoach == alphaCoach);
	
	System.out.println("both point to same object :" + result);
	
	System.out.println("\n memory location for theCoach :" + theCoach);
	
	System.out.println("\n memory location for alphaCoach: " + alphaCoach);
	
	
	context.close();
	
	}
	
}
