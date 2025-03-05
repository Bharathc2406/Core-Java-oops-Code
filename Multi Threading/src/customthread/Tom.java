package customthread;

public class Tom extends Thread {

	@Override
	public void run() {

		Thread t = Thread.currentThread();
		for(int i= 1;i<=5;i++) {
			System.out.println(t.getName()+" is printing "+i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
