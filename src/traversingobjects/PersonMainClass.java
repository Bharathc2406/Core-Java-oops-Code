package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMainClass {

	public static void main(String[] args) {

		Person p1 =new Person(20,"Jack",5.5);
		Person p2 = new Person(21,"Jhon",5.6);

		ArrayList<Person> l =new ArrayList<Person>();
		l.add(p1);
		l.add(p2);

		Iterator<Person> i =l.iterator();

		while(i.hasNext()) {
			Person p =i.next();
			System.out.println("Age:"+p.age+" Name:"+p.name+" Height:"+p.heigth );
		}
	}
}
