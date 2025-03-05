package day5;

import java.util.Scanner;

public class Amazon {

	static void checkEligibility(int marks) throws InvalidMarkException {
		if(marks>=60) {
			System.out.println("Apply for amazon interview");
		}
		else {

			throw new InvalidMarkException("Better luck next time!");


		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Marks");
		int marks = scan.nextInt();
		try {
			checkEligibility(marks);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
		}


	}
}
