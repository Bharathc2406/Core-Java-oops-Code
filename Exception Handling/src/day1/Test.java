package day1;

public class Test {

	public static void main(String[] args) {

		System.out.println("START");

		int[] a = {10,20,30};

		try {
			System.out.println(a[100]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}

		System.out.println("END");
	}
}
