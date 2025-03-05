package com;

public class Jerry extends Thread {

	@Override
	public void run() {
		for(int j=6;j<=10;j++) {
			System.out.println("j :"+j);
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
