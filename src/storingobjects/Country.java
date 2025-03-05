package storingobjects;

public class Country {


	String name;
	int population;

	Country(String name,int population){
		this.name= name;
		this.population=population;
	}

	@Override
	public String toString() {
		return "Country Name is "+name+" & Population is "+population+" crores";
	}
}
