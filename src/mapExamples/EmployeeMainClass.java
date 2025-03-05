package mapExamples;

import java.util.Set;
import java.util.TreeMap;

public class EmployeeMainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee(100);
		Employee e2 = new Employee(200);
		Employee e3 = new Employee(300);

		TreeMap<Employee, String> map = new TreeMap<Employee, String>();
		map.put(e1, "John");
		map.put(e2, "Jack");
		map.put(e3, "Alex");

		Set<Employee> keys = map.keySet();
		for(Employee key :keys) {
			System.out.println(key +" "+" Name:"+map.get(key));
		}
	}
}
