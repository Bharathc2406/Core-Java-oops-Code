package customexception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int balance =5000;

		System.out.println("Enter the amount to be withdrawn");
		int amount = scan.nextInt(); //2000
		scan.close();

		if(amount<=balance) {
			System.out.println("Amount withdrawn successfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("No Sufficient Balance");
			} catch (InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
