package org;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		int a= 10;
		double b =1.2;

		ArrayList al = new ArrayList();
		al.add(a); //al.add(new Integer(10));
		al.add(b); //al.add(new Double(1.2));

		for(Object obj :al) {
			System.out.println(obj);
		}

		System.out.println("----------");

		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
