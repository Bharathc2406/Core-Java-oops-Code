package customexception;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter  Password");
		int password =scan.nextInt();
		scan.close();

		if(password ==123) {
			System.out.println("Login Successful");
		}
		else {
			try {
				throw new InvaildPasswordException("Kindly enter valid password");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
