package com.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		System.out.println("Inside Baseball constructor");
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		//use my fortune service to get fortune
		return fortuneService.getFortune();
	}
	//add a init method
	public void doMyStartUpStuff() {
		System.out.println("BaseballCoach: Inside method doMyStartUpStuff");
	}
	//add a destroy method
	public void doMyCloseUpStuff() {
		System.out.println("BaseballCoach: Inside method doMyCloseUpStuff");
	}
}
