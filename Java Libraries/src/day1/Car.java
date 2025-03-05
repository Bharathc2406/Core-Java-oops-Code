package day1;

public class Car {
	@Override
	public String toString() {
		return "Car@123";
	}

	public static void main(String[] args) {

		Car c =new Car();

		System.out.println(c); //c.toString()
		System.out.println(c.toString());

	}
}
