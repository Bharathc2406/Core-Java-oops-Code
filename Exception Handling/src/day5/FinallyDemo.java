package day5;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("START");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("INVALID DENOMINATOR");
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("END");
	}
}
