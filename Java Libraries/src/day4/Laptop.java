package day4;

public class Laptop {

	String brand;
	int cost;

	Laptop(String brand,int cost) {
		this.brand=brand;
		this.cost=cost;
	}

	@Override
	public String toString() {
		return "Brand:"+brand+" Cost:"+cost;
	}
}

