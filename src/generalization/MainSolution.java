package generalization;

import java.util.ArrayList;

public class MainSolution {

	public static void main(String[] args) {

		ArrayList<MobileApplication> l = new ArrayList<MobileApplication>();
		l.add(new Swiggy());
		l.add(new PhonePe());
		l.add(new Uber());

		for(MobileApplication obj : l) {
			if(obj instanceof Swiggy) {
				Swiggy s =(Swiggy) obj;
				s.food();
			}
			else if(obj instanceof PhonePe) {
				PhonePe p = (PhonePe) obj;
				p.makePayment();
			}
			else if(obj instanceof Uber) {
				Uber u = (Uber) obj;
				u.bookCab();
			}
		}
	}
}
