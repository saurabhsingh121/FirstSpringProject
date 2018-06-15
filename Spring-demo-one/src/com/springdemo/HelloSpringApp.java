package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach",Coach.class);

		//call methods on the bean
		System.out.println(myCoach.getDailyWorkOut());
		
		System.out.println(myCoach.getDailyFortune());
		
		Coach newCoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(newCoach.getDailyWorkOut());
		
		System.out.println(newCoach.getDailyFortune());
		//close the context
		context.close();
	}
}
