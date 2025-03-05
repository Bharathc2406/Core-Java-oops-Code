package com;

import java.util.LinkedList;

public class MethodRunner {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(10);
		l.add(30);

		System.out.println(l); // [10, 20, 10, 10, 30]
		System.out.println(l.indexOf(10)); //0
		System.out.println(l.indexOf(100)); //-1
		System.out.println(l.lastIndexOf(10)); //3
	}
}
