package defaultsorting;

import java.util.TreeSet;

public class HotelMainClass {

	public static void main(String[] args) {

		Hotel h1 = new Hotel("Taj", 4.5);
		Hotel h2 = new Hotel("RNR",3.6);
		Hotel h3 = new Hotel("Ambur",4.0);

		TreeSet<Hotel> t = new TreeSet<Hotel>();
		t.add(h1);
		t.add(h2);
		t.add(h3);

		for(Hotel h:t) {
			System.out.println(h);
		}
	}
}
