package org;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsExample {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);

		for(Integer i:l) { //for(int i:l) {
			System.out.println(i);
		}

		System.out.println("-------------");

		LinkedList<Double> ll= new LinkedList<Double>();
		ll.add(12.5);
		ll.add(1.2);
		ll.add(12.3);

		for(double x:ll) { //for(Double x:ll) {
			System.out.println(x);
		}

		System.out.println("------------");

		ArrayList al = new ArrayList();
		al.add(10); //al.add(new Integer(10));
		al.add(1.2); //al.add(new Double(1.2));

		//Generalization or Upcasting
		//1.Object obj = new Integer(10);
		//2. Object obj = new Double(1.2);
		for(Object obj : al) {
			System.out.println(obj); //Internally -> obj.toString() -> toString() is
									 //overridden in all Wrapper Classes
		}
	}
}
