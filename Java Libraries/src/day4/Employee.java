package day4;

public class Employee {

	int id;

	Employee(int id){
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) { //1.Upcasting Object obj=new Employee(100);
		if(obj instanceof Employee) { //check if obj is having employee object
			Employee e =(Employee) obj; //3.Downcasting
			return this.id ==e.id; //4.Comparison logic --> e1.id =e2.id -->true
		}
		return false;	//5.return false if we compare other objects
	}

	public static void main(String[] args) {
		Employee e1= new Employee(100);
		Employee e2 = new Employee(100); 

		System.out.println(e1.equals(e2));
	}
}
