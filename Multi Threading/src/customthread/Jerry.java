package customthread;

public class Jerry implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=6;i<=10;i++) {
			System.out.println(t.getName()+" is printing "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
