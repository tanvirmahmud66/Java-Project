package multi_threads;

public class Fahim {
	public static void main(String[] args) {
		
		
		newThread t = new newThread();
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(t.x);
		
	}
}


class newThread extends Thread{
	int x = 0;
	public void run() {
		for (int i = 0; i < 1000000000; i++) {
			x++;
		}
	}
}