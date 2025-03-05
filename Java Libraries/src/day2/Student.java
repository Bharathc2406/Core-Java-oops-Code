package day2;

public class Student {

	int age;

	Student(int age){
		this.age=age;
	}

	@Override
	public boolean equals(Object obj) { //1.upcasting Object obj =new Student();
		if(obj instanceof Student) { //2.checking if obj is having Student Object
			Student s =(Student) obj; //3.downcasting
			return this.age==s.age; //4.comparison logic s1.age==s2.age
		}
		return false; //5.returing false  for  negative scnario

	}
	public static void main(String[] args) {

		Student s1 =new Student(20);
		Student s2 = new Student(20);
		System.out.println(s1.equals(s2)); //s1.equals(new Student(s2));
	}

}

//s1-->this
//s2--> obj(upcasting references)--> s(downcasted references)
//In the above program,upcasting is achived only when we call/invoke equals().
