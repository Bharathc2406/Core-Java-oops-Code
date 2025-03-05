package mapExamples;

import java.util.*;

public class StudentMainClass {

	public static void main(String[] args) {

		Student s1 = new Student("John");
		Student s2 = new Student("Jack");

		LinkedHashMap<Student, Integer> map = new LinkedHashMap<Student, Integer>();
		map.put(s1, 50); //map.put(new Student("John"),50);
		map.put(s2, 60); //map.put(new Student("Jack"),60);

		Set<Student> keys = map.keySet();

		for(Student key:keys) {
			System.out.println(key+" "+" Marks: "+map.get(key));
		}

	}
}
