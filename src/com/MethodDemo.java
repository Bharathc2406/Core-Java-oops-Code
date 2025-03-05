package com;

import java.util.ArrayList;

public class MethodDemo {

	public static void main(String[] args) {

		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		x.add("java");

		ArrayList y = new ArrayList();
		y.add(x); //y.addall(x);
		y.add(30);

		System.out.println("Elements --> "+y+" Size --> "+y.size());
	}
}

/**
 * 1. If we use y.addAll(x); --> All the objects 1 Collection is added into
 *    another Collection 1 by 1  (Sequentially).
 *    Therefore Elements are[10,20,30] and Size is 3
 *    
 * 2. If we y.add(x) --> All the objects of 1 Collection is added into another
 *    Collection are single object.
 *    Therefore Elements are [[10,20],30] (nested list) and Size is 2
 */