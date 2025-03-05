package org;

public class MainClass {

	public static void main(String[] args) {

		Amazon obj = new Amazon(); //Runnable type of object
		Thread t = new Thread(obj); //Converting Runnable type into Thread type
		t.setName("amazon"); //setting /initializing thread name
		t.start(); //invoking start()


		Thread t1 = new Thread(new Amazon());
		t1.setName("amazon");
		t1.start();

		Thread t2 = new Thread(new Amazon(),"amazon");
		t2.start();

		new Thread(new Amazon(),"amazon").start();
	}
}
