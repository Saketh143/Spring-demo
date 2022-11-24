package com.luv2code.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",
				Coach.class);
		
		System.out.println(theCoach.getDailyFortune() );
	
//		CricketCoach theCoachtwo = context.getBean("myCoachtwo",
//				CricketCoach.class);
//		
//		System.out.println(theCoachtwo.getDailyFortune());
//		System.out.println(theCoachtwo.getEmailAddress());
//		
		context.close();
	}

}
