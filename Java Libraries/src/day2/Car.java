package day2;

public class Car {

	int cost;

	Car(int cost){
		this.cost =cost;
	}

	@Override
	public boolean equals(Object obj) { //upcasting object obj =new Car();
		if(obj instanceof Car) {
			Car c =(Car) obj; //downcasting
			return this.cost==c.cost; //comparison logic
		}
		return false;
	}
	public static void main(String[] args) {
		Car c1 =new Car(50000);
		Car c2 =new Car(50000);
		Car c3 = new Car(25000);

		System.out.println(c1.equals(c2)); //true

		System.out.println(c1.equals(c3)); //false

		System.out.println(c1.equals(new Car(100))); //false
		System.out.println(new Car(100).equals(new Car(100))); //true

		if(c1.equals(c2)) {
			System.out.println("COST IS SAME");

		}
		else {
			System.out.println("COST IS DIFFERENT");
		}
	}
}
