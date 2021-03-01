package bookStore;
import java.util.Scanner;
public class myBookStore {
	
	static Scanner sc = new Scanner(System.in);
    static String[] books = {"java", "C", "Python"};
    static final double teacher = 0.40;
    static final double student = 0.30;
    static final double alien = 0.00;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prln("--------WELCOME TO OUR BOOKSTORE--------");
        pr("\n\nWhich book you want?\nAns: ");
        String userbookName = sc.nextLine();
        
        if (books[0].toLowerCase().equals(userbookName.toLowerCase())) {
            prln("You opted for " + books[0]);
            calculatePrice(books[0]);
        } else if (books[1].toLowerCase().equals(userbookName.toLowerCase())) {
            prln("You opted for " + books[1]);
            calculatePrice(books[1]);
        } else if (books[2].toLowerCase().equals(userbookName.toLowerCase())) {
            prln("You opted for " + books[2]);
            calculatePrice(books[2]);
        } else {
            prln("Sorry, We don't have that Book");
        }
	}
	
	static void calculatePrice(String bookName) {
        pr("Are you Teacher/Student/Alien?\nAns:");
        String ans = sc.nextLine();
        double price = 200;

        if (ans.toLowerCase().equals("teacher")) {
            price = price - (price * teacher);
            DisplayPrice(price);
        } else if (ans.toLowerCase().equals("student")) {
            price = price - (price * student);
            DisplayPrice(price);
        } else if (ans.toLowerCase().equals("alien")) {
            price = price - (price * alien);
            DisplayPrice(price);
        } else {
            prln("Sorry, We can't serve!!!");
        }

    }

    static void DisplayPrice(double price) {
        prln("Your total payble amount: " + price + "\n\n");
        prln("-------THANK YOU FOR SHOPPING FROM OUR BOOKSTORE--------");
    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void pr(Object anyObject) {
        System.out.print(anyObject);
    }

}
