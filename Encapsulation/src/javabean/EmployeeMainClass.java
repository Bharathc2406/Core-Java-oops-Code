package javabean;

import java.util.Scanner;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		Employee e = new Employee();

		System.out.println("Enter Id :");
		int id = sc.nextInt();
		e.setId(id); //e.setId(sc.nextInt());

		System.out.println("Enter Name:");
		e.setName(sc.next());

		System.out.println("Enter Salary");
		e.setSalary(sc.nextDouble());
		sc.close();

		System.out.println("---EMPLOYEE DETAILS-----");
		System.out.println("id: "+e.getId());
		System.out.println("Name: "+e.getName());
		System.out.println("Salary :"+e.getSalary());
		// System.out.println("hello "+e.getId()+" "+e.getName()+" "+e.getSalary());







	}
}
