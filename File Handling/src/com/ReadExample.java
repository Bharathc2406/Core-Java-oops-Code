package com;

import java.io.File;
import java.io.FileReader;

public class ReadExample {

	public static void main(String[] args) throws Exception {

		File f =new File("student.txt");

		FileReader fr = new FileReader(f);

		int x = fr.read();

		while(x!=-1) {
			System.out.print((char)x);
			x=fr.read();
		}
		fr.close();
	}
}
