package TicketBocking;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	
	static void AuthenticationSystem() {
		try {
			File file = new File("E:/My code/Java/Mini_Project/AuthenticationDataBase.txt");
			PrintWriter write = new PrintWriter(new FileWriter(file,true));
			Scanner read = new Scanner(file);
			Scanner keyboard = new Scanner(System.in);
			Customers customers = new Customers();
			
			System.out.println("1. Loging.");
            System.out.println("2. Register.");
            System.out.println("3. Exit.");
            System.out.print("Choose Option: ");
            int option = keyboard.nextInt();
            
            switch (option) {
				case 1:
					System.out.println("\n:::::::Login:::::::");
					System.out.print("Username: ");
					String userName = keyboard.next();
					boolean found = false;
					
					while (read.hasNext() && !found) {
						if(read.next().toLowerCase().equals(userName.toLowerCase())) {
							System.out.print("Password: ");
							String passWord = keyboard.next();
							if(read.next().toLowerCase().equals(passWord.toLowerCase())) {
								System.out.println("\nLogin Successful");
								found = true;
								transportSystemMenu();
							}
						}
					}
					if (!found) {
						System.out.println("Login Incorrect!!! Please Try Again.\n");
						AuthenticationSystem();
						
					}
					break;

				case 2:
					System.out.println("\n:::::::Register Page:::::::");
					System.out.print("Username: ");
					String username = keyboard.next();
					customers.setUsername(username);
					
					System.out.print("Password: ");
					String password = keyboard.next();
					customers.setPassword(password);
					
					System.out.print("Enter Your First Name: ");
					String firstName = keyboard.next();
					customers.setFirstName(firstName);
					
					System.out.print("Enter Your last Name: ");
					String lastName = keyboard.next();
					customers.setLastName(lastName);
					
					System.out.print("Enter Your Country: ");
					String countryName = keyboard.next();
					customers.setCountryName(countryName);
					
					System.out.print("Enter Your Age: ");
					int age = keyboard.nextInt();
					customers.setAge(age);
					
					System.out.print("Enter Your Email Address: ");
					String email = keyboard.next();
					customers.setEmail(email);
					
					System.out.println("You've Successfully register! You may login now.\n");
					
					write.println(customers.getUsername());
					write.println(customers.getPassword());
					write.println(customers.getFirstName());
					write.println(customers.getLastName());
					write.println(customers.getCountryName());
					write.println(customers.getAge());
					write.println(customers.getEmail());
					write.close();
					AuthenticationSystem();
					break;
					
				case 3:
					System.out.println("\n--------THANK YOU--------");
                    break;
					
				default:
					System.out.print("Invaild Input Option!!!");
                    System.out.println("1/2/3....Please!!!\n");
					AuthenticationSystem();
			}
            read.close();
			keyboard.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void transportSystemMenu(){
		System.out.println("\n:::::Transport System::::::");
		System.out.println("1.Bus");
		System.out.println("2.Train");
		System.out.println("3.Air");
		System.out.println("4.Logout");
		System.out.print("Choose Your Transport System: ");
		int n = sc.nextInt();
		
		if (n==1) {
			bus();
		}else if (n==2) {
			train();
		}else if (n==3) {
			air();
		}else if (n==4) {
			System.out.println("\nlogout Successfully.\n");
			AuthenticationSystem();
		}
		
	}
	
	static void bus() {
		System.out.println("\n::::::::BUS TICKETS BOCKING PROTOCOL::::::::");
		Bus bus = new Bus();
		bus.inputFromBus();
		
	}
	
	static void train() {
		System.out.println("\n::::::::TRAIN TICKETS BOCKING PROTOCOL::::::::");
		Train train = new Train();
		train.inputFromTrain();
	}
	
	static void air() {
		System.out.println("\n::::::::AIR TICKETS BOCKING PROTOCOL::::::::");
		Air airbus = new Air();
		airbus.inputFromAir();
	}
	
	public static void main(String[] args) {
		System.out.println("--------WELCOME TO TICKET BOCKING SYSTEM-------\n");
		AuthenticationSystem();

	}
	
	
}
