package day4;

public class Person {

	int age;
	String name;

	Person(int age, String name){
		this.age=age;
		this.name=name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.age == p.age && this.name.equals(p.name);
		}
		return false;
	}


	public static void main(String[] args) {
		Person p1 = new Person(21,"Raju");
		Person p2 = new Person(21,"Raju");

		System.out.println(p1.equals(p2));
	}
}
