package primitivecasting;

public class Demo {
	public static void main(String[] args) {
		//Widening
		int a=25;
		double b=a;
		System.out.println(a+" "+b);//25 25.0

		double c=10;
		System.out.println(c);//10.0

		char x='B';
		int y=x;
		System.out.println(x+" "+y);//B 66

		System.out.println("--------------");

		//Narrowing
		double i=12.5;
		int j=(int) i;
		System.out.println(i+" "+j);//12.5 12

		int z =(int) 40.23;
		System.out.println(z);//40

		int p=97;
		char q=(char) p;
		System.out.println(p+" "+q);//97 a


		System.out.println("------------------------");

		System.out.println((int)50.67);
		System.out.println((char)65);
		System.out.println("A"+"B");
		System.out.println("A"+10);
		System.out.println("A"+"B");
		System.out.println("A"+10+20);
		System.out.println(10+20+"A");
		System.out.println('A'+'B');
		System.out.println('a'+20);

	}
}
