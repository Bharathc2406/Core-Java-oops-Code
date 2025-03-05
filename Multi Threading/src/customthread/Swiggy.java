package customthread;

public class Swiggy extends Thread {

	@Override
	public void run() {
		System.out.println("Ordering Food");
		Thread t = Thread.currentThread();
		System.out.println("Id :"+t.getId());
		System.out.println("Name :"+t.getName());
		System.out.println("Priority :"+t.getPriority());
	}
}
