package traversingobjects;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeMainClass {

	public static void main(String[] args) {

		LinkedList<Employee> l = new LinkedList<Employee>();
		l.add(new Employee("Jhon",3.5));
		l.add(new Employee("Jack", 4.5));

		Iterator<Employee>  i = l.iterator();

		while(i.hasNext()) {
			Employee e =i.next();
			System.out.println("Salary of "+e.name+" is "+e.salary+"LPA");
		}
	}
}
