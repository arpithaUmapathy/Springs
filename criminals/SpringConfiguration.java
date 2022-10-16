package com.xworkz.criminals.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages ="com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
   @Bean
	public ViewResolver viewResolver() {
		System.out.println("Calling view Resolver");
		return new InternalResourceViewResolver("/",".jsp");
		
	}
	
}
