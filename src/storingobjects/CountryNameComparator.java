package storingobjects;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country>{

	@Override
	public int compare(Country x ,Country y) {
		return x.name.compareTo(y.name); 
		// return y.name.compareTo(x.name);
	}
}

//x --> Current Object To be Inserted
//y --> Already Existing Object