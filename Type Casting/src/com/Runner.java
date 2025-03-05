package com;

public class Runner {

	static void display(Employee obj) {
		if(obj instanceof Developer) {
			Developer d =(Developer)obj;
			System.out.println("id :"+d.id+"  "+"name :"+d.name);
			d.develop();


		}
		else if(obj instanceof Tester) {
			Tester t =(Tester) obj;
			System.out.println("id :"+t.id+"  "+"name :"+t.name);
			t.testApp();

		}
	}
	public static void main(String[] args) {
		display(new Developer());
		System.out.println("----------");
		display(new Tester());
	}
}
