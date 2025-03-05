package mapExamples;

import java.util.Set;
import java.util.TreeMap;

public class MovieMainClass {

	public static void main(String[] args) {

		Movie m1 = new Movie("Puspa");
		Movie m2 = new Movie("KGF");
		Movie m3 = new Movie("Devera");

		TreeMap<Movie, Double> map = new TreeMap<Movie, Double>(new MovieNameComparator());
		map.put(m1, 4.4);
		map.put(m2, 4.0);
		map.put(m3, 3.5);

		Set<Movie> keys = map.keySet();
		for(Movie key:keys) {
			System.out.println(key+" "+" Ratings: "+map.get(key));
		}
	}
}
