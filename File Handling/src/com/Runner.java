package com;

import java.io.File;

public class Runner {

	public static void main(String[] args) {
		
		File f1 = new File("car");
		File f2 = new File("vehicle");
		System.out.println(f1.renameTo(f2));
		
	}
}
