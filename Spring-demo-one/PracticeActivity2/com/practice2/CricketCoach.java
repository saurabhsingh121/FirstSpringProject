package com.practice2;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In setter method of setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "You have to practice batting today.";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
