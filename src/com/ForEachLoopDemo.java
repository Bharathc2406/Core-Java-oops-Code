package com;

public class ForEachLoopDemo {

	public static void main(String[] args) {

		int[] a = {10,20,30};
		for(int i:a) {
			System.out.println(i);
		}

		System.out.println("----------");

		double[] marks = {89.1,45.3,67.2};
		for(double x:marks) {
			System.out.println(x);
		}

		System.out.println("-----------");

		String[] subjects = {"Java","Python","Javascript"};
		for(String s:subjects) {
			System.out.println(s);
		}
	}
}
