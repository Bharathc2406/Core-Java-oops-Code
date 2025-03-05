package day5;

import java.util.Scanner;

public class Flipkart {

	static void checkOTP(int otp) throws InvalidOTPException{
		if(otp==123) {
			System.out.println("Login successful");
		}
		else {
			throw new InvalidOTPException("Better next luck next time!");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter otp");
		int otp = scan.nextInt();

		try {
			checkOTP(otp);
		} catch (InvalidOTPException e) {
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
		}
	}
}
