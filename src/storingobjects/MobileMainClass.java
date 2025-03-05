package storingobjects;

import java.util.ArrayList;
import java.util.Collections;

public class MobileMainClass {

	public static void main(String[] args) {
		Mobile m1 = new Mobile(200);
		Mobile m2 = new Mobile(300);
		Mobile m3 = new Mobile(100);

		ArrayList<Mobile> l = new ArrayList<Mobile>();
		l.add(m1);
		l.add(m2);
		l.add(m3);

		System.out.println("Insertion order maintained");
		for(Mobile m : l) {
			System.out.println(m);
		}

		System.out.println("-------------");

		System.out.println("Ascending order");
		Collections.sort(l);
		for(Mobile m:l) {
			System.out.println(m);
		}

		System.out.println("----------------");

		Collections.reverse(l);
		for(Mobile m:l) {
			System.out.println(m);
		}


	}
}
