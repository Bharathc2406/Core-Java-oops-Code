package day3;

public class Student {

	String name;
	int marks;

	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return name+" has scored "+marks +" marks";
	}

}
