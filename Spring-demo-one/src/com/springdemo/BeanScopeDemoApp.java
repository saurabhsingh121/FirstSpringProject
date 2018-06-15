package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from the container
		Coach myCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are same
		boolean result =(myCoach == alphaCoach);
		System.out.println("\nPoinitng to the same object: "+ result);
		
		System.out.println("\nMemory location for myCoach: " + myCoach);
		
		System.out.println("\nMemory location for alphaCoach: "+ alphaCoach +"\n");
		
		//close the context
		context.close();
	}
}
