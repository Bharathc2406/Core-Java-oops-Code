package org;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10); //al.add(new Integer(10));
		al.add(1.2); //al.add(new Double(1.2));
		al.add("java"); //a;.add(new String("java"));

		for(Object obj:al) {
			if(obj instanceof  String) {
				System.out.println(obj);
			}
		}
	}
}
