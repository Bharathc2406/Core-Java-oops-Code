package mapExamples;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(10, "Java");
		map.put("Python",1.2);
		map.put(34.7,55);

		System.out.println(map); //{10=Java, 34.7=55, Python=1.2}
		System.out.println(map.size()); //3
		System.out.println(map.get(10)); //Java
		System.out.println(map.get(23)); //null
		System.out.println(map.containsKey(34.7)); //true
		System.out.println(map.containsValue("java")); //true

		System.out.println("------------------------");

		System.out.println(map); //{10=Java, 34.7=55, Python=1.2}
		map.remove(10);
		System.out.println(map); // {34.7=55, Python=1.2}

		System.out.println("--------------------------");

		System.out.println(map.isEmpty()); //false
		map.clear(); 
		System.out.println(map+" "+map.size()); //{} 0
		System.out.println(map.isEmpty()); //true
	}
}
