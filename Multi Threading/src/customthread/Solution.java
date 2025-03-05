package customthread;

public class Solution {

	public static void main(String[] args) {

		Tom t = new Tom();
		t.setName("Tom");
		t.start();

		Jerry j = new Jerry();
		Thread t1 = new Thread(j);
		t1.setName("Jerry");
		t1.start();
	}
}
