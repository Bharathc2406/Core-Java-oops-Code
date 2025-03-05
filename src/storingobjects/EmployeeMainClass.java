package storingobjects;

import java.util.ArrayList;


public class EmployeeMainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee(100,"Jhon",3.5);
		Employee e2 = new Employee(101,"Smith",4.5);
		Employee e3 = new Employee(102,"Allen",2.3);
		Employee e4 = new Employee(103,"Jerry",3);
		Employee e5 = new Employee(105, "Jhonny", 4.5);

		ArrayList<Employee>  l= new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);

		System.out.println("EMPLOYEE DETAILS");
		System.out.println("-----------------------");

		for(Employee emp:l) {
			System.out.println(emp);
		}

		System.out.println("***********************************");

		System.out.println("EMPLOYEE DETAILS WHOSE NAME STARTS WITH 'J'");
		System.out.println("--------------------------------------------");

		for(Employee emp:l) {
			if(emp.name.startsWith("J") ) { //if(emp.name.charAt(0) =='J'){
				System.out.println(emp);
			}
		}


		System.out.println("**************************************");

		System.out.println("EMPLOYEE DETAILS WHOSE SALARY IS BETWEEN 2.5 - 3.5");
		System.out.println("-------------------------------------------------");

		for(Employee emp:l) {
			if(emp.salary>=2.5 && emp.salary<=3.5) {
				System.out.println(emp);
			}
		}

	}
}
