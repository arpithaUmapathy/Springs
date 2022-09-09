package com.xworkz.tv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TVStand {
	
	@Value("Samsung")
	private	 String name;
	@Value("30000")
	private	 Double price;
		public TVStand() {
		System.out.println(this.getClass().getSimpleName()+"Stand bean is created");
		}
		
		public TVStand(String name) {
			this.name = name;
		}

		public TVStand(String name, Double price) {
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
			return "Stand [name=" + name + ", price=" + price + "]";
		}

}
