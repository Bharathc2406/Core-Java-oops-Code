package storingobjects;

public class Mobile implements Comparable<Mobile>{

	int cost;
	Mobile(int cost){
		this.cost = cost;
	}

	@Override
	public String toString(){
		return "Cost:"+cost;
	}

	@Override
	public int compareTo(Mobile m) {
		return this.cost-m.cost;
	}
}
