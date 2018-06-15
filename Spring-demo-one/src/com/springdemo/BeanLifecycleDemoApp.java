package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		//retrieve the bean from the Spring container
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println("\n"+myCoach.getDailyWorkOut()+"\n");
		System.out.println(myCoach.getDailyFortune()+"\n");
		
		//close the context
		context.close();
	}
}
