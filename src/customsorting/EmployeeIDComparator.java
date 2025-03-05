package customsorting;

import java.util.Comparator;

public class EmployeeIDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee x,Employee y) {
		return x.id-y.id; //return y.id-x.id for descending
	}
}

//x --> current Object
//y --> Already existing object