package stringexamples;

public class MethodsDemo {

	public static void main(String[] args) {

		String s = "Software Engineer";
		System.out.println(s.length()); //17
		System.out.println(s.toUpperCase()); //SOFTWARE ENGINEER
		System.out.println(s.toLowerCase()); //software engineer
		System.out.println(s.startsWith("soft")); //false
		System.out.println(s.endsWith("eer")); //true
		System.out.println(s.charAt(2)); //f
		System.out.println(s.indexOf('e')); //7
		System.out.println(s.contains("ware")); //true

		System.out.println("---------------");

		String a = "Java"; 
		String b = "Java";
		String c = "JaVA";
		System.out.println(a.equals(b)); //true
		System.out.println(a.equals(c)); //false
		System.out.println(a.equalsIgnoreCase(c)); //true
	}
}
