package org;

public class Solution {

	public static void main(String[] args) {

		Swiggy s = new Swiggy();
		s.start(); //rule-3

		PhonePe obj = new PhonePe();
		Thread t = new Thread(obj);
		t.setName("PhonePe"); //rule-3
		t.start(); //rule-4
	}
}
