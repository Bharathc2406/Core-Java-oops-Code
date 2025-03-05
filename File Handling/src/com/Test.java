package com;

import java.io.File;

public class Test {

	public static void main(String[] args) throws Exception{
		
		//.txt , .doc , .xlsx , .pdf
		File f = new File("student.txt"); //File f = new File("e:/student.txt");
		
		System.out.println(f.createNewFile());
		
	}
}
