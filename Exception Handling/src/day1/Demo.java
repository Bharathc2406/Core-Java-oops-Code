package day1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Start");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int a = sc.nextInt(); //10

		System.out.println("Enter Second Number");
		int b = sc.nextInt(); //0

		sc.close();

		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Do not divide by 0");
		}

		System.out.println("End");


	}
}
