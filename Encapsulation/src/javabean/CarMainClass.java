package javabean;

public class CarMainClass {
	public static void main(String[] args) {

		Car c =new Car();

		c.setBrand("honda");

		c.setCost(10000);

		String brand = c.getBrand();
		int cost =c.getCost();

		System.out.println("Brand: "+brand);
		System.out.println("cost: "+cost);

		System.out.println("Brand: "+c.getBrand() + "   " +"cost: "+c.getCost());

	}

}
