package com.nt;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
	
	@Bean(name="cal")
	public Calendar createCalendar() {
		return Calendar.getInstance();//return Gregorian Calender class(sub class of Calender obj)
	}

	public static void main(String[] args) {
		//Bootstarp /boot spring boot App and get IOC container ref
		ApplicationContext ctx=SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
		//get target class object
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke b.method
		String result=generator.generateWishMessage("sunil");
		System.out.println("Wish Message is::"+result);
		
		//close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
