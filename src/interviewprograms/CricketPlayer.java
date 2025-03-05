package interviewprograms;

public class CricketPlayer {

	String name;
	String country;
	int runs;

	CricketPlayer(String name,String country,int runs){
		this.name=name;
		this.country=country;
		this.runs=runs;
	}

	@Override
	public String toString() {
		return "Name: "+name+"    Country:"+country+"   Runs:"+runs;
	    //return name+" plays for "+country+" & has scored "+runs+" runs";
	}

	
}
