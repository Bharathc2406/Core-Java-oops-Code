package com;

import java.io.File;
import java.io.FileReader;

public class ReadDemo {

	public static void main(String[] args)  throws Exception{

		File f = new File("employee.txt");

		FileReader fr = new FileReader(f);

		int ch =fr.read();

		while(ch !=-1) {
			System.out.print((char)ch);
			ch=fr.read();
		}

		fr.close();
	}

}
