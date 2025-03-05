package com;

public class Student {

	Student(int age){

		System.out.println("age: "+age);

	}
	Student(String name ){
		this(22);
		System.out.println("name: "+name);

	}
	Student(double height){
		this("Bharath");
		System.out.println("heigth: " +height);

	}
	public static void main(String[] args) {
		Student s = new Student(5.6);
		//new Student(5.6);
	}
}
