package com;

import java.util.Scanner;


public class BankMainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to SBI Bank");
		System.out.println("------------------------");
		Scanner scan=new Scanner(System.in);

		Bank obj =new BankImpl(); //upcasting

		while(true){//Infinite loop
			System.out.println("1.Deposit Amount \n2.Withdraw Amount");
			System.out.println("3.Check Balance \n4.Exit");
			System.out.println("Enter choice");
			int choice =scan.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter amount to be deposited");
				int amountToDeposit = scan.nextInt();
				obj.deposit(amountToDeposit);
				obj.checkBalance();
				break;

			case 2:
				System.out.println("Enter amout to be withdrawn");
				int amountToWithdraw =scan.nextInt();
				obj.withdraw(amountToWithdraw);
				obj.checkBalance();
				break;

			case 3:
				obj.checkBalance();
				break;

			case 4:
				System.out.println("Thank you | Visit Again!!");
				System.exit(0);


			default :
				System.out.println("INVALID CHOICE");
				break;
			}
			System.out.println("-----------------");

		}


		//scan.close();

	}
}
