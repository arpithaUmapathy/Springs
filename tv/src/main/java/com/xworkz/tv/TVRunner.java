package com.xworkz.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVRunner {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("contexconfig.xml");
		System.out.println(container);
		TV tv = container.getBean(TV.class);
		System.out.println(tv);
		

}

}
