package com;

public class Developer extends Employee {
	void develop() {
		System.out.println("Developing App");
	}
}

class Tester extends Employee {
	void testApp() {
		System.out.println("Testing App");
	}

}