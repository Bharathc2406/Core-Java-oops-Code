package defaultsorting;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentMainClass {

	public static void main(String[] args) {

		Student s1 = new Student(20,"Tom");
		Student s2 = new Student(23,"Jerry");
		Student s3 = new Student(22, "Jack");

		TreeSet<Student> t = new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);

		Iterator<Student> i = t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}


	}
}
