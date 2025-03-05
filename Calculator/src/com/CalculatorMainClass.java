package com;

import java.util.Scanner;

public class CalculatorMainClass {
	public static void main(String[] args) {

		System.out.println("Welcome  To Calculator Project");
		System.out.println("-------------------------------");

		Scanner scan = new Scanner(System.in);

		CalculatorImpl calc = new CalculatorImpl();
		while(true) {
			
		System.out.println("1:Addition\n2:Subtraction");
		System.out.println("3:Multipilcation\n4:Division");
		int choice = scan.nextInt();

		/*
		 * local variable do not have default values, therefore initializing  to 0
		 */

		



			int a=0;
			int b=0;
			if(choice>=1 && choice<=4) {
				System.out.println("Enter 2 numbers");
				a =scan.nextInt();
				b =scan.nextInt();
			}
			if(choice ==1) {
				//System.out.println("Enter 2 numbers");
				//a =scan.nextInt();		//int a =scan.nextInt();
				//b =scan.nextInt();
				calc.add(a, b);
			}
			else if(choice == 2){
				//System.out.println("Enter 2 numbers");
				//a =scan.nextInt();
				//b =scan.nextInt();
				calc.sub(a, b);
			}
			else if(choice ==3) {
				//System.out.println("Enter 2 numbers");
				//a =scan.nextInt();
				//b =scan.nextInt();
				calc.mul(a, b);
			}
			else if(choice == 4) {
				//System.out.println("Enter 2 numbers");
				//a =scan.nextInt();
				//b =scan.nextInt();
				calc.div(a, b);
			}
			else if (choice ==5) {
				System.out.println("THANK YOU");
				System.exit(0);
			}

			else {
				System.out.println("Invalid Choice");

			}

			// scan.close();
		}
	}

}
