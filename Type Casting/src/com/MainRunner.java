package com;

public class MainRunner {

	static void display(India obj) {
		if(obj instanceof Karnataka) {
			System.out.println("State -> Karnataka");
			Karnataka k =(Karnataka) obj;
			System.out.println("PM: "+k.pm+"  "+"CM: "+k.cm);
		}
		else if(obj instanceof TamilNadu) {
			System.out.println("State -> TamilNadu");
			TamilNadu t =(TamilNadu) obj;
			System.out.println("PM: "+t.pm+"  "+"CM: "+t.cm);

		}
		else if(obj instanceof Goa) {
			System.out.println("State -> Goa");
			Goa g =(Goa) obj;
			System.out.println("PM: "+g.pm+"  "+"CM: "+g.cm);

		}
	}
	public static void main(String[] args) {
		display(new Karnataka());
		System.out.println("----------");
		display(new TamilNadu());
		System.out.println("----------");
		display(new Goa());
	}

}
