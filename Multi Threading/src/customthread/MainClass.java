package customthread;

public class MainClass {

	public static void main(String[] args) {

		Swiggy s = new Swiggy();
		s.setName("swiggy");
		s.setPriority(8);
		s.start();
	}
}
