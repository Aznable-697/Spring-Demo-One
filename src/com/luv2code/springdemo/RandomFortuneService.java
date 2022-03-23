package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	
   // Create an Array
	private String[] data = { 
			"Lucky number 7",
			"Practice makes perfect",
			"Coding our way to a new job!"
	};
	// create a random number generator
		private Random myRandom = new Random();
			
		@Override
		public String getFortune() {
			// pick a random string from the array
			int index = myRandom.nextInt(data.length);
			
			String theFortune = data[index];
			
			return theFortune;
        }
		
    }
	
	
	

