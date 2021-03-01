package TicketBocking;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Train extends Menu{
	Scanner trainInp = new Scanner(System.in);
	static final int acCabin = 1200;
	static final int nonAcCabin = 750;
	static final int shovon = 500;
	static final int chair = 450;

	void ReInputFromTrain() {
		System.out.print("Option: ");
		int op = trainInp.nextInt();
		menuChooseOption(op);

	}

	public void inputFromTrain() {
		displayFunctionTrain();
		System.out.print("Option: ");
		int op = trainInp.nextInt();
		menuChooseOption(op);

	}

	void displayFunctionTrain() {
		System.out.println("1.Buy Ticket");
		System.out.println("2.My account");
		System.out.println("3.Bocking History");
		System.out.println("4.Route costing");
		System.out.println("5.Ticket Cancllation");
		System.out.println("6.About Bangladesh Railway");
		System.out.println("7.Back to Main Menu.");
		System.out.println("8.Logout");
	}

	void menuChooseOption(int n) {

		if (n == 1) {
			System.out.println("\n-------Buy Ticket-------\n");
			BuyTicket();
		} else if (n == 2) {
			System.out.println("\n-------My Account-------\n");
			MyAccount();
		}else if (n==3) {
			System.out.println("\n-------Bocking History-------\n");
			bockingHistory();
		} else if (n == 4) {
			System.out.println("\n-------Route Costing-------\n");
			RoutCosting();
		} else if (n == 5) {
			System.out.println("\n-------Tickets Cancellation-------\n");
			ticketCancellation();
		} else if (n == 6) {
			System.out.println("\n-------About Bangladesh Railway-------");
			aboutBangladeshRailway();
		}else if (n==7) {
			transportSystemMenu();
		}else if (n==8) {
			System.out.println("\nLogout Successfully\n");
            AuthenticationSystem();
		} else {
			System.out.println("Invalid Input. Please Try Again.");
			ReInputFromTrain();
		}
	}

	void BuyTicket() {
		Scanner scanTrain = new Scanner(System.in);

		System.out.print("From: ");
		String deperture = scanTrain.nextLine();
		System.out.print("To: ");
		String destination = scanTrain.nextLine();
		System.out.println("Qaulity: 1.Ac Cabin  2.Non-Ac Cabin  3.Shovon  4.Chair Coach");
		System.out.print("Option: ");
		int select = scanTrain.nextInt();
		String quality=null;

		System.out.print("Number of Seat: ");
		int seatNo = scanTrain.nextInt();
		int Price = 0;

		// matching input from data file and record all data file into file
		try {
			File file5 = new File("E:/My code/Java/Mini_Project/TrainDepurture.txt");
			File file6 = new File("E:/My code/Java/Mini_Project/TrainDatabase.txt");
			Scanner scanFileDeperture = new Scanner(file5);
			Scanner scanFileDestination = new Scanner(file5);
			PrintWriter recordTrainData = new PrintWriter(new FileWriter(file6, true));
			Customers trainCustomers = new Customers();
			

			while (scanFileDeperture.hasNext()) {
				if (scanFileDeperture.next().toLowerCase().equals(deperture.toLowerCase())) {
					System.out.println("\nDeperture From: " + deperture.toUpperCase());
				}
			}
			scanFileDeperture.close();
			while (scanFileDestination.hasNext()) {
				if (scanFileDestination.next().toLowerCase().equals(destination.toLowerCase())) {
					System.out.println("Destination: " + destination.toUpperCase());
				}
			}
			scanFileDestination.close();

			if (select == 1) {
				Price = seatNo * acCabin;
				quality = "Ac";
				System.out.println("Total Seat: " + seatNo);
				System.out.println("Seat Quality: "+quality);
				System.out.println("Total Ticket Price: " + Price);
			} else if (select == 2) {
				Price = seatNo * nonAcCabin;
				quality = "Non.Ac";
				System.out.println("Total Seat: " + seatNo);
				System.out.println("Seat Quality: "+quality);
				System.out.println("Total Ticket Price: " + Price);
			} else if (select == 3) {
				Price = seatNo * shovon;
				quality = "Shovon";
				System.out.println("Total Seat: " + seatNo);
				System.out.println("Seat Quality: "+quality);
				System.out.println("Total Ticket Price: " + Price);
			} else if (select == 4) {
				Price = seatNo * chair;
				quality = "Chair";
				System.out.println("Total Seat: " + seatNo);
				System.out.println("Seat Quality: "+quality);
				System.out.println("Total Ticket Price: " + Price);
			}
			
			trainCustomers.setDeperture(deperture);
			trainCustomers.setDestination(destination);
			trainCustomers.setAcOption(quality);
			trainCustomers.setTotalSeat(seatNo);
			trainCustomers.setTotalPrice(Price);
			
			recordTrainData.println(trainCustomers.getDeperture());
			recordTrainData.println(trainCustomers.getDestination());
			recordTrainData.println(trainCustomers.getAcOption());
			recordTrainData.println(trainCustomers.getTotalSeat());
			recordTrainData.println(trainCustomers.getTotalPrice());
			recordTrainData.println();
			
			recordTrainData.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("\n1.Go to main Menu(Pess-1)");
        System.out.println("2.Logout");
        int press = scanTrain.nextInt();
        if (press == 1) {
            inputFromTrain();
        } else {
            System.out.println("Logout Successfully\n");
            AuthenticationSystem();
        }scanTrain.close();

	}

	void MyAccount() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter username: ");
		String usrName = scan.nextLine();
		
		try {
			File file7 = new File("E:/My code/Java/Mini_Project/AuthenticationDataBase.txt");
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
				MyAccount();
			}
			
			System.out.println("\n1.Go to main Menu(Pess-1)");
	        System.out.println("2.Logout");
	        int press = scan.nextInt();
	        if (press == 1) {
	            inputFromTrain();
	        } else {
	            System.out.println("Logout Successfully\n");
	            AuthenticationSystem();
	        }scan.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void RoutCosting() {
		System.out.println("Under Construction....\n");
		inputFromTrain();
	}

	void bockingHistory() {
		try {
			File file8 = new File("E:/My code/Java/Mini_Project/TrainDatabase.txt");
			Scanner scanfile8 = new Scanner(file8);
			Scanner con = new Scanner(System.in);
			
			while (scanfile8.hasNext()) {
				String deperture = scanfile8.next().toLowerCase();
				String destination = scanfile8.next().toLowerCase();
				String trainQuality = scanfile8.next().toLowerCase();
				String seat = scanfile8.next().toLowerCase();
				String price = scanfile8.next().toLowerCase();
				
				System.out.println("Deperture From: "+deperture);
				System.out.println("Destination: "+destination);
				System.out.println("Seat Quality: "+trainQuality);
				System.out.println("Seat No: "+seat);
				System.out.println("Total Price: "+price);
				System.out.println("\n");
				
			}scanfile8.close();
			
			System.out.println("\n1.Go to main Menu(Pess-1)");
	        System.out.println("2.Logout");
	        int press = con.nextInt();
	        if (press == 1) {
	            inputFromTrain();
	        } else {
	            System.out.println("Logout Successfully\n");
	            AuthenticationSystem();
	        }con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void ticketCancellation() {
		System.out.println("Under Construction....\n");
		inputFromTrain();
	}

	void aboutBangladeshRailway() {
		//will be a huge amount of print function :)
		System.out.println("Native Name: Bangladesh Railway.");
		System.out.println("Type: Department of the Govt. of Bangladesh.");
		System.out.println("Industry: Railways And Iocomotives");
		System.out.println("Founded: 1862");
		System.out.println("Headquaters: Dhaka, Bangladesh");
		System.out.println("Area: Bangladesh");
		System.out.println("Key People: Mohammad Amzad Hossain,\nDirector of Bangladesh Railway");
		System.out.println("Revenue: 8002 million (2014)");
		System.out.println("Net Income: 8015 million (2014)");
		System.out.println("Owner: British Raj (Until 1947)\n\tDominion of Pakistan\n\tGovernment of Pakistan\n\tGovernment of East Pakistan\n\tGovernment of Bangladesh");
		System.out.println("Number of Emplyees: 27535 (2015)");
		System.out.println("Division: East zone And West zone");
		System.out.println("Website: www.railway.govt.bd");
		System.out.println("\n1.Go to main Menu(Pess-1)");
        System.out.println("2.Logout");
        int press = trainInp.nextInt();
        if (press == 1) {
            inputFromTrain();
        } else {
            System.out.println("Logout Successfully\n");
            AuthenticationSystem();
        }
	}

	
}
