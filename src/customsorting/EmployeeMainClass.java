package customsorting;

import java.util.TreeSet;

public class EmployeeMainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee(102,"Jhon");
		Employee e2 = new Employee(103,"Smith");
		Employee e3 = new Employee(101, "Allen");

		//TreeSet<Employee> t = new TreeSet<Employee>(new EmployeeNameComparator());

		TreeSet<Employee> t =new TreeSet<Employee>( new EmployeeIDComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);

		for(Employee e:t) {
			System.out.println(e);
		}
	}
}
