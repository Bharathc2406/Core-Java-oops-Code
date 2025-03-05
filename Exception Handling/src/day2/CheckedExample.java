package day2;

import java.io.FileNotFoundException;
import java.io.FileReader;

class CheckedExample {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}

		}
		try {
			FileReader f  =new FileReader("car.txt");
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}

	}
}
