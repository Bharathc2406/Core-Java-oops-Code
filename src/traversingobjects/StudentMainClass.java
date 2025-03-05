package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMainClass {

	public static void main(String[] args) {

		Student s1 = new Student(20,"Tom");
		Student s2 = new Student(21,"Jhon");

		ArrayList<Student> l =new ArrayList<Student>();
		l.add(s1); //l.add(new Student(20,"Tom"));
		l.add(s2); //l.add(new Student(20,"Tom"));

		Iterator<Student> i =l.iterator();

		while(i.hasNext()) {
			Student s =i.next();
			System.out.println("Age:"+s.age +" Name"+s.name);

		}

	}
}
