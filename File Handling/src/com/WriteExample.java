package com;

import java.io.File;
import java.io.FileWriter;

public class WriteExample {

	public static void main(String[] args) throws Exception {

		File f = new File("student.txt");

		FileWriter fw = new FileWriter(f,true); //append = false

		fw.write(" at Jspiders");

		fw.flush();

		fw.close();

		System.out.println("Data Stored Successfully");
	}
}
