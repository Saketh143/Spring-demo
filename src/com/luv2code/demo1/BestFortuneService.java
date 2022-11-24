package com.luv2code.demo1;

public class BestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String a[] = new String[3];
		a[0] = "Today is not your day, Be CareFul";
		a[1] = "Its Your day.Make it Fullest";
		a[2] =  "Its a great day,but stil be active";
		
		int index =  ((int)(Math.random()*10)%3);
		
		return a[index];
	}

}
