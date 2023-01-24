package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Vehicle;
import com.nt.cfgs.AppConfig;

public class StrategyDPTest {

	public static void main(String[] args) {
		// create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target class object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		//involve method
		vehicle.journey("delhi","bhubneswar");
		//close container
		ctx.close();

	}

}
