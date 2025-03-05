package com;

import java.io.File;
import java.io.FileWriter;

public class WriteDemo {

	public static void main(String[] args) throws Exception {

		File f = new File("employee.txt");

		FileWriter fw = new FileWriter(f);

		fw.write("Hello World");

		fw.flush();

		fw.close();

		System.out.println("Data Stored Successfully");

	}
}
