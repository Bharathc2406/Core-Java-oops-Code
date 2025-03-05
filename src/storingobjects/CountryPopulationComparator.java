package storingobjects;

import java.util.Comparator;

public class CountryPopulationComparator implements Comparator<Country> {

	@Override
	public int compare(Country x, Country y) {
		return x.population-y.population;
		// return y.population-x.population;
	}
}

//x --> Current Object To be Inserted
//y --> Already Existing Object