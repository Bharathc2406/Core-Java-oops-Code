package com;

public class Demo {
	public static void main(String[] args) {

		Thread t = new Thread();
		System.out.println("Id :"+t.getId());
		System.out.println("Name :"+t.getName());
		System.out.println("Priority :"+t.getPriority());

		System.out.println("-------------------");

		t.setName("car thread");
		t.setPriority(8);

		System.out.println("Id :"+t.getId());
		System.out.println("Name :"+t.getName());
		System.out.println("Priority :"+t.getPriority());

	}
}
