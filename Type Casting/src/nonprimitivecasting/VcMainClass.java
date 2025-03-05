package nonprimitivecasting;

public class VcMainClass {
	public static void main(String[] args) {

		//UPCASTING
		Vehicle v= new Car();
		System.out.println(v.brand);
		v.start();

		System.out.println("-------");

		//DOWNCASTING
		Car c = (Car) v;
		System.out.println(c.brand+"   "+c.color);
		c.start();
		c.drive();
	}
}
