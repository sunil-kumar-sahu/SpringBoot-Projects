package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
   //HAS-A Property
	@Autowired //Annotation making the HAS-A property for dependency Injection/Management
    private LocalDateTime ldt;//by default holds null after injection/wiring this null will be replaced with Dependent LocalDateTime class object.
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	
	//b.mehod
	public String generateWishMessage(String user) {
		System.out.println(ldt);
		//get current hour
		int hour=ldt.getHour(); //24 hour format
		//write b.logic
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
	}
}
