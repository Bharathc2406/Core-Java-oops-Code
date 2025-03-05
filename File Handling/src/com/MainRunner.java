package com;

import java.io.File;

public class MainRunner {

	public static void main(String[] args) {
		
		File f = new File("vehicle");
		
		if(f.exists()) {
			f.delete();
			System.out.println("file/folder deleted");
		}
		else {
			System.out.println("file/folder not present");
		}
	}
}
