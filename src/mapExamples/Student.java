package mapExamples;

public class Student {

	String name;

	Student(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: "+name;
	}

}
