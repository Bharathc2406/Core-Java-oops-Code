package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Alex");
		al.add("Basil");
		al.add("Charles");
		al.add("Jack");
		al.add("Jhon");

		Scanner scan = new Scanner(System.in);
		System.out.println("1: Sort names in ascending order");
		System.out.println("2: Sort names in descending order");
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		scan.close();
		
		
		switch(choice) {
		case 1:
			Collections.sort(al);
			for(String s:al) {
				System.out.println(s);
			}
			break;

		case 2:
			Collections.sort(al);
			Collections.reverse(al);
			for(String s: al) {
				System.out.println(s);
			}
			break;

		default:
			System.out.println("INVALID CHOICE");
		}
	}
}
