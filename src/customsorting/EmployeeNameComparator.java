package customsorting;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee x,Employee y) {
		return x.name.compareTo(y.name); 
		//return y.name.compareTo(x.name); --> for descending
	}
}

//x --> current object
//y --> Already existing object
