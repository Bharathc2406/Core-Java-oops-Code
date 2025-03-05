package com;

public class Tom extends Thread { //rule-1

	@Override //rule-2
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("i :"+i);

			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
