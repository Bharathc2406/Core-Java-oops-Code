package interviewprograms;

import java.util.ArrayList;
import java.util.Collections;


public class CricketMainClass {

	public static void main(String[] args) {

		CricketPlayer cp1 = new CricketPlayer("Sachin", "INDIA", 20000);
		CricketPlayer cp2 = new CricketPlayer("Dhoni", "INDIA", 30000);
		CricketPlayer cp3 = new CricketPlayer("Virat", "INDIA", 10000);
		CricketPlayer cp4 = new CricketPlayer("Smith", "AUS", 6000);
		CricketPlayer cp5 = new CricketPlayer("Head", "AUS", 9000);

		ArrayList<CricketPlayer> l = new ArrayList<CricketPlayer>();
		l.add(cp1);
		l.add(cp2);
		l.add(cp3);
		l.add(cp4);
		l.add(cp5);

		Collections.sort(l,new CricketPlayerRunsComparator());

		System.out.println("Cricket Player With Highest Runs:");
		System.out.println(l.get(l.size()-1));

		System.out.println("======================================");

		System.out.println("Cricket Player With Lowest Runs:");
		System.out.println(l.get(0));

		System.out.println("=======================================");

		System.out.println("Cricket Player Whose Name Starts With S:");
		for(CricketPlayer cp :l) {
			if(cp.name.startsWith("S") || cp.name.startsWith("s")) {
				System.out.println(cp);
			}
		}

		System.out.println("=========================================");

		System.out.println("Cricket Player Who Represents India:");
		for(CricketPlayer cp:l) {
			if(cp.country.equals("INDIA")) {
				System.out.println(cp);
			}
		}
	}	
}
