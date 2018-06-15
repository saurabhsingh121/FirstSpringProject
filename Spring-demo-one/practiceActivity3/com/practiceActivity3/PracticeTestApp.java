package com.practiceActivity3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeTestApp {
	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the beans from the container
		Coach hockeyCoach = context.getBean("myHockeyCoach",Coach.class);
		//calling our clas methods
		//getting another bean of HockeyCoach
		Coach mynewHockeyCoach = context.getBean("myHockeyCoach", Coach.class);
		boolean equal = hockeyCoach == mynewHockeyCoach;
		System.out.println("In singleton scope case both beans are equal: "+ equal);
		System.out.println(hockeyCoach.getSalary());
		System.out.println(hockeyCoach.getTution());
		
		//Close the context
		context.close();
	}
}
