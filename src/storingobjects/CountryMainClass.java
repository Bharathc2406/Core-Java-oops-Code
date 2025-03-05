package storingobjects;

import java.util.ArrayList;
import java.util.Collections;

public class CountryMainClass {

	public static void main(String[] args) {

		Country c1 = new Country("INDIA", 145);
		Country c2 = new Country("USA", 111);
		Country c3 = new Country("UK", 101);

		ArrayList<Country> l = new ArrayList<Country>();
		l.add(c1);
		l.add(c2);
		l.add(c3);

		Collections.sort(l,new CountryPopulationComparator());
		for(Country c :l) {
			System.out.println(c);
		}

		System.out.println("--------------------------");

		Collections.sort(l,new CountryNameComparator());
		for(Country c: l) {
			System.out.println(c);
		}
	}
}
