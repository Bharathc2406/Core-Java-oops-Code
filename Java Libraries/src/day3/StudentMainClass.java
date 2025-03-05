package day3;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s1 = new Student("Jhon",80);

		Student s2 = new Student("Jack",34);

		Student[] s= {s1,s2};
		for(int i=0;i<s.length ;i++) {
			System.out.println(s[i]); // printing s1 & s2 (reference variables)
									 // implicitly calls toString();
		}
	}

}
