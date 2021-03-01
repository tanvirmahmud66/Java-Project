package TicketBocking;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Air extends Menu {
	Scanner airInp = new Scanner(System.in);
	static final int economy = 40000;
	static final int premium = 50000;
	static final int business = 30000;
	static final int first = 100000;
	
	
	void ReInputFromaAir() {
		System.out.print("Option: ");
		int optn = airInp.nextInt();
		menuChooseOption(optn);
		
	}
	public void inputFromAir() {
		displayFunctionAir();
		System.out.print("Option: ");
		int op = airInp.nextInt();
		menuChooseOption(op);
		
	}
	
	
	void displayFunctionAir() {
		System.out.println("\n:::::::::Menu:::::::::");
		System.out.println("1.Buy Tickets");
		System.out.println("2.My Profile");
		System.out.println("3.Bocking History");
		System.out.println("4.Tickets Cancellation");
		System.out.println("5.About Bangladesh AirLine");
		System.out.println("6.Logout");
	}
	
	
	void menuChooseOption(int num) {
		
		if (num==1) {
			System.out.println("\n-------Buy Tickets-------\n");
			BuyTickets();
		}else if (num==2) {
			System.out.println("\n-------My Profile-------\n");
			MyProfile();
		}else if (num==3) {
			System.out.println("\n-------Bocking History-------\n");
			BookingHistory();
		}else if (num==4) {
			System.out.println("\n------Tickets Cancellation-------\n");
			TicketCancell();
		}else if (num==5) {
			System.out.println("\n-------About Bangladesh AirLine-------\n");
			About();
		}else if (num==6) {
			System.out.println("\nLogout Successfully\n");
            AuthenticationSystem();
		}else {
			System.out.println("Invalid Input. Please Try Again.");
			ReInputFromaAir();
			
		}
	}
	
	void BuyTickets() {
		Scanner scanAir = new Scanner(System.in);
		
		System.out.print("From: ");
		String deperture = scanAir.nextLine();
		System.out.print("To: ");
		String destination = scanAir.nextLine();
		System.out.println("1. One way\n2.Round Trip");
		System.out.print("Option: ");
		int option = scanAir.nextInt();
		System.out.println("1.Economy\n2.Premium\n3.Business\n4.First");
		int qualityOption = scanAir.nextInt();
		String qulity = null;
		String type = null;
		System.out.print("Seat: ");
		int seatno = scanAir.nextInt();
		int price = 0;
		
		try {
			File file9 = new File("E:/My code/Java/Mini_Project/AirPort.txt");
			File file10 = new File("E:/My code/Java/Mini_Project/AirDatabase.txt");
			Scanner scanFileDeperture = new Scanner(file9);
			Scanner scanFileDestination = new Scanner(file9);
			PrintWriter recordAir = new PrintWriter(new FileWriter(file10,true));
			Customers airCustomers = new Customers();
			
			while(scanFileDeperture.hasNext()) {
				if(scanFileDeperture.next().toLowerCase().equals(deperture.toLowerCase())){
					System.out.println("\nDeperture From: "+deperture.toUpperCase());
				}
			}scanFileDeperture.close();
			while (scanFileDestination.hasNext()) {
				if (scanFileDestination.next().toLowerCase().equals(destination.toLowerCase())) {
					System.out.println("Destination: "+destination.toUpperCase());
				}
			}scanFileDestination.close();
			
			if(option == 1) {
				if (qualityOption == 1) {
					price = seatno*economy;
					type = "Oneway";
					qulity = "Economy";
					System.out.println("Trip: "+type);
					System.out.println("Quality: "+qulity);
					System.out.println("Seat: "+seatno);
					System.out.println("Total Cost: "+price);
				}else if (qualityOption == 2) {
					price = seatno*premium;
					type = "Oneway";
					qulity = "Premium";
					System.out.println("Trip: "+type);
					System.out.println("Quality: "+qulity);
					System.out.println("Seat: "+seatno);
					System.out.println("Total Cost: "+price);
				}else if (qualityOption == 3) {
					price = seatno*business;
					type = "Oneway";
					qulity = "Business";
					System.out.println("Trip: "+type);
					System.out.println("Quality: "+qulity);
					System.out.println("Seat: "+seatno);
					System.out.println("Total Cost: "+price);
				}else if (qualityOption == 4) {
					price = seatno*first;
					type = "Oneway";
					qulity = "Fisrt";
					System.out.println("Trip: "+type);
					System.out.println("Quality: "+qulity);
					System.out.println("Seat: "+seatno);
					System.out.println("Total Cost: "+price);
				}else {
					System.out.println("Wrong Input.\n");
					BuyTickets();
				}
			}else if (option==2) {
				if (qualityOption == 1) {
					price = seatno*economy;
					price *=2;
					type = "Oneway";
					qulity = "Economy";
					System.out.println("Trip: "+type);
					System.out.println("Quality: "+qulity);
					System.out.println("Seat: "+seatno);
					System.out.println("Total Cost: "+price);
				}else if (qualityOption == 2) {
					price = seatno*premium;
					price *=2;
					type = "Oneway";
					qulity = "Premium";
					System.out.println("Trip: "+type);
					System.out.println("Quality: "+qulity);
					System.out.println("Seat: "+seatno);
					System.out.println("Total Cost: "+price);
				}else if (qualityOption == 3) {
					price = seatno*business;
					price *=2;
					type = "Oneway";
					qulity = "Business";
					System.out.println("Trip: "+type);
					System.out.println("Quality: "+qulity);
					System.out.println("Seat: "+seatno);
					System.out.println("Total Cost: "+price);
				}else if (qualityOption == 4) {
					price = seatno*first;
					price *=2;
					type = "Oneway";
					qulity = "Fisrt";
					System.out.println("Trip: "+type);
					System.out.println("Quality: "+qulity);
					System.out.println("Seat: "+seatno);
					System.out.println("Total Cost: "+price);
				}else {
					System.out.println("Wrong Input.\n");
					BuyTickets();
				}
			}
			
			airCustomers.setDeperture(deperture);
			airCustomers.setDestination(destination);
			airCustomers.setTrip(type);
			airCustomers.setSeatClass(qulity);
			airCustomers.setTotalSeat(seatno);
			airCustomers.setTotalPrice(price);
			
			recordAir.println(airCustomers.getDeperture());
			recordAir.println(airCustomers.getDestination());
			recordAir.println(airCustomers.getTrip());
			recordAir.println(airCustomers.getSeatClass());
			recordAir.println(airCustomers.getTotalSeat());
			recordAir.println(airCustomers.getTotalPrice());
			recordAir.println();
			
			recordAir.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("\n1.Go to main Menu(Pess-1)");
        System.out.println("2.Logout");
        int press = scanAir.nextInt();
        if (press == 1) {
            inputFromAir();
        } else {
            System.out.println("Logout Successfully\n");
            AuthenticationSystem();
        }scanAir.close();
		
	}
	
	void BookingHistory() {
		try {
			File file11 = new File("E:/My code/Java/Mini_Project/AirDatabase.txt");
			Scanner scanFile11 = new Scanner(file11);
			Scanner input = new Scanner(System.in);
			
			while (scanFile11.hasNext()) {
				String deperture = scanFile11.next().toLowerCase();
				String destination = scanFile11.next().toLowerCase();
				String trip = scanFile11.next().toLowerCase();
				String quality = scanFile11.next().toLowerCase();
				String seat = scanFile11.next().toLowerCase();
				String price = scanFile11.next().toLowerCase();
				
				System.out.println("Deperture From: "+deperture);
				System.out.println("Destination: "+destination);
				System.out.println("Trip: "+trip);
				System.out.println("Ticket Quality: "+quality);
				System.out.println("Seat: "+seat);
				System.out.println("Total Price: "+price);
				System.out.println("\n");
				
			}scanFile11.close();
			
			System.out.println("\n1.Go to main Menu(Pess-1)");
	        System.out.println("2.Logout");
	        int press = input.nextInt();
	        if (press == 1) {
	            inputFromAir();
	        } else {
	            System.out.println("Logout Successfully\n");
	            AuthenticationSystem();
	        }input.close();
		
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void MyProfile() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter username: ");
		String usrName = scan.nextLine();
		
		try {
			File file7 = new File("F:/My code/Eclipse_Project/Mini_Project/AuthenticationDataBase.txt");
			Scanner scanFile7 = new Scanner(file7);
			boolean found = false;
			
			while (scanFile7.hasNext() && !false) {
				if (scanFile7.next().toLowerCase().equals(usrName.toLowerCase())) {
					System.out.print("Enter password: ");
					String pasWord = scan.nextLine();
					if(scanFile7.next().toLowerCase().equals(pasWord.toLowerCase())) {
						String namefirst = scanFile7.next().toUpperCase();
						String nameLast = scanFile7.next().toUpperCase();
						String country = scanFile7.next().toUpperCase();
						String age = scanFile7.next();
						String email = scanFile7.next();
						
						System.out.println("\nName: "+namefirst+" "+nameLast);
						System.out.println("Country: "+country);
						System.out.println("age: "+age);
						System.out.println("Email: "+email);						
						System.out.println();
						
						found = true;
					}
				}
			}scanFile7.close();
			
			if(!found) {
				System.out.println("Login Incorrect!!! Please try Again.\n");
				MyProfile();
			}
			
			System.out.println("\n1.Go to main Menu(Pess-1)");
	        System.out.println("2.Logout");
	        int press = scan.nextInt();
	        if (press == 1) {
	            inputFromAir();
	        } else {
	            System.out.println("Logout Successfully\n");
	            AuthenticationSystem();
	        }scan.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void TicketCancell() {
		System.out.println("Under Construction....\n");
		inputFromAir();
	}
	
	
	void About() {
		//we be Huge amount of print function
		System.out.println("Founded: 4-January-1972.");
		System.out.println("Hubs: Shahajalal International Airport.");
		System.out.println("Secondary Hubs: Shah Amanat International Airport.");
		System.out.println("Frequent Flyer Program: Biman Loyalty Club");
		System.out.println("Fleet Size: 18");
		System.out.println("Destination: 24");
		System.out.println("Headquarters: Balaka Bhaban Kurmitota, Dhaka, Bangladesh");
		System.out.println("Key People: Shajjadul Hassan.");
		System.out.println("Revenue: 5791 Crore.");
		System.out.println("Operating Income: 3175 Crore.");
		System.out.println("Profit: 272 Crore.");
		System.out.println("Total Assets: 2082 Crore.");
		System.out.println("Website: www.biman-airlines.com\n");
		
		System.out.println("\n1.Go to main Menu(Pess-1)");
        System.out.println("2.Logout");
        int press = airInp.nextInt();
        if (press == 1) {
            inputFromAir();
        } else {
            System.out.println("Logout Successfully\n");
            AuthenticationSystem();
        }airInp.close();
		
	}


}
