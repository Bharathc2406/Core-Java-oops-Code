package com;

import java.util.Scanner;

public class CalculatorMainClass {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);

		Calculator calc = new CalculatorImpl();
		System.out.println("enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();

		calc.add(a,b);
		calc.mul(a, b);

		scan.close();
	}
}
