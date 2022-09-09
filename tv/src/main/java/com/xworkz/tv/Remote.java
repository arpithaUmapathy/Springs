package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Remote {
	
	@Value("Samsung")
	private String name;
	@Value("7000")
	private Double price;

	public Remote() {
		System.out.println(this.getClass().getSimpleName() + "Remote bean is created");
	}

	public Remote(String name) {
		this.name = name;
	}

	public Remote(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Remote [name=" + name + ", price=" + price + "]";
	}

}
