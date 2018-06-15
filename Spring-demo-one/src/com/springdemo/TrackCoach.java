package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	public TrackCoach(FortuneService tdFortune) {
		this.fortuneService = tdFortune;
	}
	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}
}
