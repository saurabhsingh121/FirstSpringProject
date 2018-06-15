package com.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	//add new fields for email address and team
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	//our setter method which actually inject our dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method setTeam");
		this.team = team;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	public String getTeam() {
		return this.team;
	}
	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 mins";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
