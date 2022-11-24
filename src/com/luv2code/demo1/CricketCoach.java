package com.luv2code.demo1;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		System.out.println("inside no-arg constructors");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter method : Cricket Coach : emailAddress");

		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside setter method : Cricket Coach : team");

		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method : Cricket Coach : fortune service");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice cover drive for 30mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
