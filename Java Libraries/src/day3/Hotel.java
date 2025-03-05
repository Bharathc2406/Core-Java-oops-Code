package day3;

public class Hotel {

	String name;
	double ratings;

	Hotel(String name,double ratings) {
		this.name=name;
		this.ratings=ratings;
	}

	@Override
	public String toString() {
		return "Ratings of "+name+" hotel is "+ratings;
	}
}
