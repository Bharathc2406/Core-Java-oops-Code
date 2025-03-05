package day4;

public class LaptopMainClass {
	public static void main(String[] args) {
		Laptop l1 =new Laptop("Dell",50000);
		Laptop l2 =new Laptop("Hp",50000);

		Laptop[] l = {l1 ,l2};

		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]); // printing l1 & l2 --> reference variable --> toString
		}


	}
}
