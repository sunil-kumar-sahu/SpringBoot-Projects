package com.nt.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::0-param constructor");
	}
	
 @Bean(name="sysDate")
 public LocalDateTime createLDT(){
	 System.out.println("AppConfig.createLDT()");
	 return LocalDateTime.now();
 }
}
