package nonprimitivecasting;

public class MainClass {
	public static void main(String[] args) {

		//UPCASTING
		Father f =new Son();
		System.out.println(f.name);

		System.out.println("------");


		//DOWNCASTING
		Son s =(Son) f;
		System.out.println(s.name+" "+s.age);

	}

}
