package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileMainClass {

	public static void main(String[] args) {

		Mobile m1 = new Mobile("Apple",50000);
		Mobile m2 = new Mobile("Oneplus",20000);

		ArrayList<Mobile> l= new ArrayList<Mobile>();
		l.add(m1); //l.add( new Mobile("Apple",50000));
		l.add(m2); //l.add( new Mobile("One plus",20000));

		Iterator<Mobile> i = l.iterator();

		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
