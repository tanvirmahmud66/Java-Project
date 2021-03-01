package Multiple_Thread;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	
	private static OurThread t1 = new OurThread("MyThread1", 0,1, 500, true);
	private static OurThread t2 = new OurThread("MyThread2", 100,10, 1000, true);
	private static OurThread t3 = new OurThread("MyThread1", 1000,100, 1000, true);
	
	public static void main(String[] args) {
		
		
		
		t1.start(); t2.start(); t3.start();
		
		System.out.print("Enter a Command: ");
		String command = sc.nextLine();
		
		while (!command.toLowerCase().equals("exit")) {
			if (command.equals("1")) {
				System.out.println("Thread 1: "+t1.getCounter());
				threadStatus();
			}else if (command.equals("2")) {
				System.out.println("Thread 2: "+t2.getCounter());
				threadStatus();
			}else if (command.equals("3")) {
				System.out.println("Thread 3: "+t3.getCounter());
				threadStatus();
			}else if (command.equals("1s")) {
				t1.threadStop();
				System.out.println("Thread 1 Stoped.");
				threadStatus();
			}else if (command.equals("2s")) {
				t2.threadStop();
				System.out.println("Thread 2 Stoped.");
				threadStatus();
			}else if (command.equals("3s")) {
				t3.threadStop();
				System.out.println("Thread 3 Stoped.");
				threadStatus();
			}else {
				System.out.println("Input valid Command!!");
			}
			
			command = sc.nextLine();
		}
		
		sc.close();
		
	}
	
	public static void threadStatus() {
		System.out.println("Thread 1 Status: "+t1.isAlive());
		System.out.println("Thread 2 Status: "+t2.isAlive());
		System.out.println("Thread 3 Status: "+t3.isAlive());

	}
	
}
