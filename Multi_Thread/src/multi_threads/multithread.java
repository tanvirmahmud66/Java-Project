package multi_threads;

public class multithread {

	public static void main(String[] args) {
		
		Tanvir ob = new Tanvir();
		ob.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Fahim");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
	}

}


class Tanvir extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tanvir");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
	}
	
}