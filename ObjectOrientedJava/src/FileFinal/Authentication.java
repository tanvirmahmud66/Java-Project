
package FileFinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        
        File file = new File("database.txt");
        try {
            PrintWriter out = new PrintWriter(new FileWriter(file,true));
            Scanner input = new Scanner(file);
            Scanner keyboard = new Scanner(System.in);
            Customer customer = new Customer();
            
            System.out.println("1. Loging");
            System.out.println("2. Register");
            
            int option = keyboard.nextInt();
            switch(option){
                case 1:
                    System.out.println("Login Page");
                    System.out.println("Username");
                    String inpUser = keyboard.next();
                    boolean found = false;
                    
                    while(input.hasNext() && !found){
                        if(input.next().equals(inpUser)){
                            System.out.println("Password: ");
                            String inpPass = keyboard.next();
                            if(input.next().equals(inpPass)){
                                System.out.println("Login Successful");
                                found = true;
                                break;
                            }
                        }
                    }
                    if(!found){
                        System.out.println("Login incorrect");
                    }
                    
                case 2:
                    System.out.println("Register Page");
                    System.out.println("Username: ");
                    String username = keyboard.next();
                    customer.setUsername(username);
                    
                    System.out.println("PassWord: ");
                    String password = keyboard.next();
                    customer.setPassword(password);
                    
                    System.out.println("You've Successfully register! You may login now.");
                    
                    out.println(customer.getUsername());
                    out.println(customer.getPassword());
                    
                    out.close();
                    break;
                    
                default:
                    System.out.println("1 OR 2 PLEASE");
                    
            }
            keyboard.close();
            input.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
