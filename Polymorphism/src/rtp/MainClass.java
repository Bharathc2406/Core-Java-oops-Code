package rtp;

public class MainClass {


	//if display(new Developer()); --> Employee obj =new Developer(); -->obj.work()
	//if display(new Tester()); --> Employee obj =new Tester(); -->obj.work()

	static void display(Employee obj) {
		obj.work();
	}


	public static void main(String[] args) {
		//1.Upcasting using a method
		display(new Developer());
		display(new Tester());

		System.out.println("--------");


		// Upcasting using single reference variable
		Employee emp;
		emp =new Developer(); //Rule-3 --> upcasting
		emp.work(); //DA
		emp=new Tester();//Rule-3 -->upcasting
		emp.work(); //TA


		System.out.println("----------");

		// Upcasting using separate reference variable
		Employee e1 =new Developer();
		e1.work();

		Employee e2 =new Tester();
		e2.work();




	}

}
