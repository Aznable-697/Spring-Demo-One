package com.luv2code.springdemo;

public class CodingCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public CodingCoach() {
		
	}
	
	public CodingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
	//Custom Class		
		return "Code for atleast 1 hour per day";		
	}

	@Override
	public String getDailyFortune() {		
		return "Software company coming: " + fortuneService.getFortune();
	}

}
