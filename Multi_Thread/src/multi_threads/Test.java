package multi_threads;

//Threading by Runnable

public class Test {
	public static void main(String[] args) {
		
		myThread ob = new myThread();
		Thread thread = new Thread(ob, "myThread1");
		thread.start();
		System.out.println(thread.getName());
		Thread thread2 = Thread.currentThread();
		System.out.println(thread2.getName());
		
	}
}

class myThread extends A implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("Tanvir Mahmud Fahim");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
}

class A{
	
}

