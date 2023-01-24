package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
//all spring beans are taken as final class(StartegyDP Rule #3)
public final class Vehicle {
	@Autowired //for field level Dependency Injection
	@Qualifier("diesel")
	private Engine engg; //HAS-A Property (composition:StartegyDP Rule#1)
	
	public Vehicle() {
		System.out.println("Vehicle::0-param constructor");
	}
	
	//b.method using dependent
	public void journey(String startPlace,String destPlace) {
		engg.start();
		System.out.println("Vehicle::journey started at::"+startPlace);
		System.out.println("journey is going on......");
		engg.stop();
		System.out.println("Vehicle::journey stopped at::"+destPlace);
	}

}
