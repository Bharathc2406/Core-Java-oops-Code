package mapExamples;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie x,Movie y) {
		return x.name.compareTo(y.name);
	}
}
