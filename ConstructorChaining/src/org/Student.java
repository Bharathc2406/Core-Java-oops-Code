package org;

public class Student {
	int age; //22
	String name; // John

	Student(int age){
		this.age=age;
	}
	Student(int age,String name){
		this(age); // this(22) --> this.age =age;
		this.name =name;

	}
	public static void main(String[] args) {
		Student s =new Student(22,"Jhon");
		System.out.println("Age: "+s.age);
		System.out.println("Name: "+s.name);
	}


}
