package org;

public class PhonePe implements Runnable{ //rule-1

	@Override //rule-2
	public void run() {
		System.out.println("Paying bill");
	}
}

//PhonePe is a runnable type object