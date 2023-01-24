package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.Hospital;

@SpringBootApplication
public class BootProj04ValueAnnotationApplication {
	

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj04ValueAnnotationApplication.class, args);
		
		//get SpringBean class object
		 Hospital hospital=ctx.getBean("hsptl",Hospital.class);
		 //invoke the method
		 System.out.println(" spring bean class obj data::"+hospital);
		 
		 //close container
		 ((ConfigurableApplicationContext) ctx).close();
		 System.out.println("=============");
		 System.out.println("system properties are::"+System.getProperties());
		
	
		
	}

}