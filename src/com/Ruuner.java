package com;

import java.util.ArrayList;

public class Ruuner {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(25);
		l.add(37);

		System.out.println(l); //[12, 25, 37]
		l.add(1,55);
		System.out.println(l); //[12,55,25, 37]
		l.set(2,77);
		System.out.println(l); //[12,55,77, 37]
	}
}
