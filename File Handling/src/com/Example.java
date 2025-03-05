package com;

import java.io.File;
import java.util.Date;

public class Example {

	public static void main(String[] args) {

		//specifying file name
		File f = new File("student.txt");

		//getting milliSeconds value
		long milliSeconds = f.lastModified();

		//converting milliSeconds value into date format
		Date d = new Date(milliSeconds);

		// printing references variable ,calls toString()
		System.out.println(d);

		File f1 = new File("student.txt");
		Date d1 = new Date(f1.lastModified());
		System.out.println(d1);

		Date d2 = new Date(new File("student.txt").lastModified());
		System.out.println(d2);

		System.out.println(new Date(new File("student.txt").lastModified()));
	}
}
