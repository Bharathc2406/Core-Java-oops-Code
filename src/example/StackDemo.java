package example;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		s.push(10); //add() can also be used
		s.push(20);
		s.push(30);


		System.out.println(s); //[10,20,30]
		System.out.println(s.pop()); //remove() can also be used
		System.out.println(s.pop());
		System.out.println(s.pop());
		// System.out.println(s.pop()); --> EmptyStackException
	}
}
