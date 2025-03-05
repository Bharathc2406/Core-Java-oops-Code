package com;

import java.util.ArrayList;

public class MethodExample {

	public static void main(String[] args) {

		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);

		ArrayList y = new ArrayList();
		y.addAll(x);
		y.add(30);

		System.out.println(x); //[10,20]
		System.out.println(y); //[10,20,30]
		System.out.println("----------");

		System.out.println(y.containsAll(x)); //true
		System.out.println("-------------");

		System.out.println(y); //[10,20,30]
		y.removeAll(x);
		System.out.println(y); //[30]
	}
}
