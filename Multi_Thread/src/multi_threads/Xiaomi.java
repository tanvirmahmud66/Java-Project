package multi_threads;

public class Xiaomi {
	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		//daemon thread execute by main thread
		mobile m = new mobile();
		m.setDaemon(true);//false= non-Daemon thread and true = daemon thread and must write before calling start()
		m.start();
		System.out.println(m.isAlive());
		
		
		System.out.println("Main Thread Ended and x = "+m.x);
	}
}

//non-Daemon thread/ user Thread 
class mobile extends Thread{
	int x;
	public void run() {
		for (int i = 0; i < 10000000; i++) {
			x++;
		}
		
		System.out.println("mobile Thread Ended and x = "+x);
	}
}