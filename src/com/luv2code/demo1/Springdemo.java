package com.luv2code.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springdemo {
	
	public static void main(String[] args) {
//		System.out.println("hello");
//		ClassPathXmlApplicationContext context = 
//				new ClassPathXmlApplicationContext(
//						"applicationContext.xml");
//		
//	Coach theCoach = context.getBean("myCoach",
//				Coach.class);
//	
//     	System.out.println(theCoach.getDailyFortune() );
//	
//		CricketCoach theCoachtwo = context.getBean("myCoachtwo",
//				CricketCoach.class);
//		
//		System.out.println(theCoachtwo.getDailyFortune());
//		System.out.println(theCoachtwo.getEmailAddress());
//		System.out.println(theCoachtwo.getTeam());
//		context.close();
		
		ClassPathXmlApplicationContext context2 = new 
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// retrieve the bean from spring container
		Coach theCoach2 = context2.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context2.getBean("myCoach",Coach.class);
		
		// check if they are same
		boolean result = (theCoach2 == alphaCoach);
		
		System.out.println("both point to same object :" + result);
		
		System.out.println("\n memory location for theCoach :" + theCoach2);
		
		System.out.println("\n memory location for alphaCoach: " + alphaCoach);
		
		
		context2.close();
	}
}
