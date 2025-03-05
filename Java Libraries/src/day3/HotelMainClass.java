package day3;

public class HotelMainClass {

	public static void main(String[] args) {

		Hotel h1 =new Hotel("Taj",4.5);
		Hotel h2 =new Hotel("RNR",4);
		Hotel h3 =new Hotel("District1953",4.6);
		Hotel h4 =new Hotel("Windsor",4.5);

		Hotel[] h = {h1,h2,h3,h4};

		for(int i=0;i<h.length;i++) {
			System.out.println(h[i]);
		}

		System.out.println("--------");

		System.out.println("Hotel details whose ratings are above 4.4");
		for(int i=0;i<h.length;i++) {
			if(h[i].ratings >=4.4) {
				System.out.println(h[i]);
			}
		}


	}
}
