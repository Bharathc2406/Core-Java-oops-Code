package traversingobjects;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainClass {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(10.5);
		al.add(10.6);

		// Only forward traversing --> Iterator
		Iterator<Double> i = al.iterator();

		while(i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("*******************");

		//forward & backward traversing -->ListIterator
		ListIterator<Double> itr = al.listIterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------------");

		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

		System.out.println("*******************");

		//backward traversing --> ListIterator
		ListIterator<Double> ltr = al.listIterator(al.size());

		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

	}
}
