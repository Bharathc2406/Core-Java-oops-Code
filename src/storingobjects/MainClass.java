package storingobjects;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		Student s1 = new Student(20,"Tom");

		Student s2 = new Student(21, "Jerry");

		ArrayList<Student> l = new ArrayList<Student>();
		l.add(s1); //l.add(new Student(20,"Tom"));
		l.add(s2); //l.add(new Student(21,"Jerry"));

		for(Student s:l) {
			System.out.println(s);
		}

		System.out.println("------------");

		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}
}
