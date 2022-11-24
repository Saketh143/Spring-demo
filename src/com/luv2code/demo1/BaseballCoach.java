package com.luv2code.demo1;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run for 30mins and then bat";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
