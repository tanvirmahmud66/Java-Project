package multi_threads;

public class Car {
	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Car");
			}
		});
		t.start();
	}
}
