package defaultsorting;

import java.util.TreeSet;

public class EmployeeMainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Jhon");
		Employee e2 = new Employee(103,"Allen");
		Employee e3 = new Employee(102, "Jack");

		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);

		for(Employee e: t) {
			System.out.println(e);
		}
	}
}
