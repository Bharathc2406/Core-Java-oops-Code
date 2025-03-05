package setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Demo {

	public static void main(String[] args) {

		// Insertion order is not maintained
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(1.2);
		hs.add(10);
		hs.add(null);
		hs.add(true);

		System.out.println("Size: "+hs.size());
		for(Object obj :hs) {
			System.out.println(obj);
		}

		System.out.println("--------------");

		// Insertion order is maintained
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(20);
		lhs.add(40);
		lhs.add(10);
		lhs.add(40);

		System.out.println("Size: "+lhs.size());
		for(int i : lhs) {
			System.out.println(i);
		}

		System.out.println("----------------");

		//Maintained natural sorting order(ascending order)
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(30);
		t.add(10);
		t.add(10);
		t.add(20);

		System.out.println("Size: "+lhs.size());
		for(int i:t) {
			System.out.println(i);
		}

	}
}
