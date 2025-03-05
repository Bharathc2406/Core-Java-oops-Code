package com;

import java.util.Scanner;

class Demo {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);

		//INFINTE LOOP
		while(true) {

			System.out.println("Enter choice:");
			int choice =scan.nextInt();


			if(choice==1) {
				System.out.println("Hai");
			}



			else if(choice == 2) {
				System.out.println("Bye");

			}
			else if(choice == 3) {
				System.out.println("THANK YOU");
				System.exit(0);

			}
			else {
				System.out.println("INVALID");

			}
			System.out.println("------------------");
		}


	}

}
