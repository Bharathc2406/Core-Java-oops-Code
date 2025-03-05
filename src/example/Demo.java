package example;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);

		ListIterator<Integer> i = l.listIterator();

		while(i.hasNext()) {
			System.out.println(i.next()); 
		}

		System.out.println("------------------");

		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}

		System.out.println("**********************");

		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);

		ListIterator<Integer> itr = al.listIterator(al.size());

		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}
}
