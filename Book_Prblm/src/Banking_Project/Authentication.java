package Banking_Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Authentication extends Banking {

    public static void main(String[] args) {
        System.out.println("----------WELCOME TO OUR BANK----------\n");
        Authentic();
    }

    static void Authentic() {
        File file = new File("database.txt");
        try {
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            Scanner input = new Scanner(file);
            Scanner keyboard = new Scanner(System.in);
            Customer customer = new Customer();

            System.out.println("1. Loging");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Choose Option: ");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n:::::::Login Page:::::::");
                    System.out.print("Username: ");
                    String inpUser = keyboard.next();
                    boolean found = false;

                    while (input.hasNext() && !found) {
                        if (input.next().toLowerCase().equals(inpUser.toLowerCase())) {
                            System.out.print("Password: ");
                            String inpPass = keyboard.next();
                            if (input.next().toLowerCase().equals(inpPass.toLowerCase())) {
                                System.out.println("Login Successful\n");
                                found = true;
                                menu();
                                break;
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("Login Incorrect!!! Please Try Again.\n");
                        Authentic();
                    }
                    break;

                case 2:
                    System.out.println("\n:::::::Register Page:::::::");
                    System.out.print("Username: ");
                    String username = keyboard.next();
                    customer.setUsername(username);

                    System.out.print("PassWord: ");
                    String password = keyboard.next();
                    customer.setPassword(password);

                    System.out.println("You've Successfully register! You may login now.\n");

                    out.println(customer.getUsername());
                    out.println(customer.getPassword());
                    out.close();
                    Authentic();
                    break;

                case 3:
                    System.out.println("--------THANK YOU--------");
                    break;

                default:
                    System.out.print("Invaild Input Option!!!");
                    System.out.println("1/2/3....Please!!!\n");
                    Authentic();

            }
            keyboard.close();
            input.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
