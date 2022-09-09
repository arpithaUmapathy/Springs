package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SetTopBox {
	
	@Value("Sun direct")
	private	 String name;
	@Value("300000")
	private	 Double price;


	public SetTopBox(String name) {
		this.name = name;
	}

	public SetTopBox(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public SetTopBox() {
		System.out.println(this.getClass().getSimpleName()+"SetupBox Bean is created");
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
		return "SetTopBox [name=" + name + ", price=" + price + "]";
	}



	
}
