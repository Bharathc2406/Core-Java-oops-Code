package org;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(15);
		v.add(20);

		for(Integer i: v) {
			System.out.println(i);
		}

		System.out.println("---------------------");

		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
	}
}
