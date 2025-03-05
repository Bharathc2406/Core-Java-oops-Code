package rtp;

public class Runner {

	static void display(FoodDeliveryApp app) {
		app.orderFood();
	}

	public static void main(String[] args) {
		//1.Upcasting using a method
		display(new Swiggy());
		display(new Zomato());

		System.out.println("---------");

		// Upcasting using single reference variable
		FoodDeliveryApp fdp;
		fdp =new Swiggy();
		fdp.orderFood();

		fdp =new Zomato();
		fdp.orderFood();


		System.out.println("-----------");

		// Upcasting using separate reference variable
		FoodDeliveryApp f1 = new Swiggy();
		f1.orderFood();

		FoodDeliveryApp f2 = new Zomato();
		f2.orderFood();
	}
}
