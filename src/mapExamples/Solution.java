package mapExamples;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		LinkedHashMap<String , Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Tom",21);
		map.put("Jerry", 22);
		map.put("Smith", 30);

		Set<String> keys =map.keySet();

		for(String key:keys) {
			System.out.println(key+" is "+map.get(key)+" years old");
		} 

	}

}
