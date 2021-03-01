package TicketBocking;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bus extends Menu {
	 static Scanner busInp = new Scanner(System.in);
	 static final int ac = 1000;
	 static final int non_ac = 500;
	 
	void ReinputFormBus() {
		System.out.print("Option: ");
		int op = busInp.nextInt();
		menuChooseOption(op);
	} 
	void inputFromBus() {
		 displayFunctionBus();
		 System.out.print("Option: ");
		 int opt = busInp.nextInt();
		 menuChooseOption(opt);
	}
	
	void displayFunctionBus() {
		System.out.println("\n:::::::::Menu:::::::::");
		System.out.println("1.Buy Tickets.");
		System.out.println("2.My Account.");
		System.out.println("3.Bocking History.");
		System.out.println("4.Tickets Cancellation.");
		System.out.println("5.Back To Main Protocol.");
		System.out.println("6.Logout");
	}
	 
	void menuChooseOption(int n) {
		if (n==1) {
			System.out.println("\n--------Buy Ticket--------\n");
			buyTicket();
		}else if (n==2) {
			System.out.println("\n-------My Account-------\n");
			MyAccount();
		}else if (n==3) {
			System.out.println("\n-------Bocking History--------\n");
			BockingHistory();
		}else if (n==4) {
			System.out.println("\n-------Ticket Cancellation--------\n");
			TicketCancellation();
		}else if (n==5) {
			transportSystemMenu();
		}else if (n==6) {
			System.out.println("\nLogout Successfully\n");
            AuthenticationSystem();
		} else{
			System.out.println("Invalid Input. Please Try Again.");
			ReinputFormBus();
		}
	}
	
	void buyTicket() {
		Scanner inf = new Scanner(System.in);
		
		System.out.print("From: ");
		String deperture = inf.nextLine();
		System.out.print("To: ");
		String destination = inf.nextLine();
		System.out.print("Ac/Non-Ac: ");
		String quality = inf.nextLine();
		System.out.print("Number Of Seat: ");
		int seatNo = inf.nextInt();
		
		
		//matching input and file data and record all data
		try {
			File file1 = new File("E:/My code/Java/Mini_Project/BusDepurture.txt");
			File file2 = new File("E:/My code/Java/Mini_Project/Busdatabase.txt");
			Scanner scanFileDeperture = new Scanner(file1);
			Scanner scanFileDestination = new Scanner(file1);
			PrintWriter recordData = new PrintWriter(new FileWriter(file2,true));
			Customers customers = new Customers();
			int price;
						
			while(scanFileDeperture.hasNext()) {
				if (scanFileDeperture.next().toLowerCase().equals(deperture.toLowerCase())) {
					System.out.println("\nDeperture From: "+deperture.toUpperCase());
					
				}
			}scanFileDeperture.close();
			while (scanFileDestination.hasNext()) {
				if (scanFileDestination.next().toLowerCase().equals(destination.toLowerCase())) {
					System.out.println("Destination: "+destination.toUpperCase());
					
				}
			}scanFileDestination.close();
			
			
			if (quality.toLowerCase().equals("ac")) {
				price = seatNo*ac;
				System.out.println("Total Seat: "+seatNo);
				System.out.println("Bus Quality: Ac");
				System.out.println("Total Ticket Costing: "+price+".Tk");
			}else if (quality.toLowerCase().equals("nonac")) {
				price = seatNo*non_ac;
				System.out.println("Total Seat: "+seatNo);
				System.out.println("Bus Quality: Non-Ac");
				System.out.println("Total Ticket Costing: "+price+".Tk");
			}
			
			customers.setDeperture(deperture);
			customers.setDestination(destination);
			customers.setAcOption(quality);
			customers.setTotalSeat(seatNo);
			
			
			recordData.println(customers.getDeperture());
			recordData.println(customers.getDestination());
			recordData.println(customers.getAcOption());
			recordData.println(customers.getTotalSeat());
			recordData.println();
			
			recordData.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		System.out.println("\n1.Go to main Menu(Pess-1)");
        System.out.println("2.Logout");
        int press = inf.nextInt();
        if (press == 1) {
            inputFromBus();
        } else {
            System.out.println("Logout Successfully\n");
            AuthenticationSystem();
        }inf.close();
		
	}
	
	void MyAccount() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter username: ");
		String usrName = scan.nextLine();
		
		try {
			File file3 = new File("E:/My code/Java/Mini_Project/AuthenticationDataBase.txt");
			Scanner scanFile3 = new Scanner(file3);
			boolean found = false;
			
			while (scanFile3.hasNext() && !false) {
				if (scanFile3.next().toLowerCase().equals(usrName.toLowerCase())) {
					System.out.print("Enter password: ");
					String pasWord = scan.nextLine();
					if(scanFile3.next().toLowerCase().equals(pasWord.toLowerCase())) {
						String namefirst = scanFile3.next().toUpperCase();
						String nameLast = scanFile3.next().toUpperCase();
						String country = scanFile3.next().toUpperCase();
						String age = scanFile3.next();
						String email = scanFile3.next();
						
						System.out.println("\nName: "+namefirst+" "+nameLast);
						System.out.println("Country: "+country);
						System.out.println("age: "+age);
						System.out.println("Email: "+email);
						System.out.println();
						
						found = true;
					}
				}
			}scanFile3.close();
			
			if(!found) {
				System.out.println("Login Incorrect!!! Please try Again.\n");
				MyAccount();
			}
			
			System.out.println("\n1.Go to main Menu(Pess-1)");
	        System.out.println("2.Logout");
	        int press = scan.nextInt();
	        if (press == 1) {
	            inputFromBus();
	        } else {
	            System.out.println("Logout Successfully\n");
	            AuthenticationSystem();
	        }scan.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	void BockingHistory() {
		try {
			File file4 = new File("E:/My code/Java/Mini_Project/Busdatabase.txt");
			Scanner scanfile4 = new Scanner(file4);
			Scanner consol = new Scanner(System.in);
			
			while (scanfile4.hasNext()) {
				String deperture = scanfile4.next().toLowerCase();
				String destination = scanfile4.next().toLowerCase();
				String busQuality = scanfile4.next().toLowerCase();
				String seat = scanfile4.next().toLowerCase();
				
				System.out.println("Deperture From: "+deperture);
				System.out.println("Destination: "+destination);
				System.out.println("Ac/Non-Ac: "+busQuality);
				System.out.println("Seat No: "+seat);
				System.out.println("\n");
				
			}scanfile4.close();
			
			System.out.println("\n1.Go to main Menu(Pess-1)");
	        System.out.println("2.Logout");
	        int press = consol.nextInt();
	        if (press == 1) {
	            inputFromBus();
	        } else {
	            System.out.println("Logout Successfully\n");
	            AuthenticationSystem();
	        }consol.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void TicketCancellation() {
		
		System.out.println("Under Construction....\n");
		inputFromBus();
	}
	
}
