package day1;

public class MethodDemo1 {

	public static void main(String[] args) {

		System.out.println("START");

		try {
			System.out.println(10/0);
		} catch (Exception e) {

			String message = e.getMessage();
			System.out.println(message);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("END");


	}
}
