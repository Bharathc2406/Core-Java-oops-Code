package generalization;

interface MobileApplication {

}

public class Swiggy  implements MobileApplication {

	void food() {
		System.out.println("Ordering Food");
	}
}

class PhonePe implements MobileApplication {

	void makePayment() {
		System.out.println("Making Payment");
	}
}

class Uber implements MobileApplication {

	void bookCab() {
		System.out.println("Booking Cab");
	}
}