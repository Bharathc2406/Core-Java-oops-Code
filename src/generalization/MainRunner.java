package generalization;

import java.util.ArrayList;

public class MainRunner {

	public static void main(String[] args) {

		ArrayList<Vehicle> l = new ArrayList<Vehicle>();
		l.add(new Car());
		l.add(new Bike());
		

		for(Vehicle obj :l) {
			if(obj instanceof Car) {
				Car c = (Car) obj;
				c.drive();
			}
			else if(obj instanceof Bike) {
				Bike b = (Bike) obj;
				b.ride();
			}
		}
	}
}
