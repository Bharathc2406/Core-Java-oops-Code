package com;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add(10);
		l.add(1.2);
		l.add(10);
		l.add(true);
		l.add(null);
		l.add("java");

		System.out.println(l); //[10, 1.2, 10, true, null, java]
		System.out.println(l.get(1)); //1.2
		System.out.println(l.size()); //6
		System.out.println(l.contains("Java")); //false
		System.out.println("----------------");

		System.out.println(l); //[10, 1.2, 10, true, null, java]
		l.remove(1);
		System.out.println(l); //[10, 10, true, null, java]
		System.out.println("------------------");

		System.out.println(l.isEmpty()); //false
		l.clear();
		System.out.println(l); //[]
		System.out.println(l.isEmpty()); //true
	}
}
