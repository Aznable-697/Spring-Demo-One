package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//TODO Load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//TODO Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		
		//TODO Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//TODO Lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//TODO Close the context
		context.close();


	}

}
