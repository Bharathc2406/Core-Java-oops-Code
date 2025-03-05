package org;

public class Car {
	String brand;
	int cost;

	Car(String brand){
		this.brand=brand;
	}
	Car(String brand, int cost){
		this(brand);
		this.cost=cost;
	}
	public static void main(String[] args) {
		Car c =new Car("suzuki",5000);
		System.out.println(c.brand);
		System.out.println(c.cost);
	}


}
