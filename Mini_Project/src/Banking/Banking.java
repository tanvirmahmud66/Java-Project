package Banking;

import java.util.Scanner;

public class Banking {
	static Scanner sc = new Scanner(System.in);
    static double balance = 500;
    static double available;

    static double mainbalance(double money) {
        balance += money;
        return balance;
    }

    static void depositMoney() {

        System.out.println("\n::::::Deposit Menu::::::");
        System.out.print("How much money you want to deposit?\nMoney: ");
        double money = sc.nextDouble();
        System.out.println("After Deposit: " + money + " Tk.\nYour courrent Balance is: " + mainbalance(money));
        available = balance - 500;
        System.out.println("Available Balance: " + available + " TK.");
        System.out.println("1.Go to main Menu(Pess-1)");
        System.out.println("2.Exit(Pess-2)");
        int press = sc.nextInt();
        if (press == 1) {
            menu();
        } else {
            System.out.println("----------THANK YOU----------");
        }

    }

    static void withdrawMoney() {

        System.out.println("\n::::::Withdraw Menu::::::");
        available = 0;
        available = balance - 500;
        System.out.println("Available Balance: " + available + " TK.");
        if (balance > 500.50) {
            System.out.print("How much money you want to Withdraw?\nMoney: ");
            double money = sc.nextDouble();
            if (money <= available) {
                balance -= money;
                System.out.println("After Withdraw: " + money + " Tk.\nYour courrent Balance is: " + balance + " TK.");
                available = balance - 500;
                System.out.println("Available Balance: " + available + " TK.");
            } else {
                System.out.println("Check Your Account Limitation");
            }
        } else {
            System.out.println("Insuficient Balance");
        }
        System.out.println("1.Go to main Menu(Pess-1)");
        System.out.println("2.Exit(Pess-2)");
        int press = sc.nextInt();
        if (press == 1) {
            menu();
        } else {
            System.out.println("----------THANK YOU----------");
        }

    }

    static void sendMoney() {

        System.out.println("\n:::::::Send Money::::::::");
        double sendAmount;
        long number;
        if (balance > 500.50) {
            System.out.print("How much you want to send:?\nMoney: ");
            sendAmount = sc.nextInt();
            if (sendAmount <= available) {
                System.out.print("Please Enter account Number\nTo: ");
                number = sc.nextInt();
                balance -= sendAmount;
                available = 0;
                available = balance - 500;
                System.out.println(sendAmount + " Tk. send Successfully to No: " + number);
                System.out.println("Main Balance: " + balance + " TK.");
                System.out.println("Avaiable Balance: " + available + " TK.");
            } else {
                System.out.println("Insuficient Balance");
            }
        } else {
            System.out.println("Insuficient Balance");
        }
        System.out.println("1.Go to main Menu(Pess-1)");
        System.out.println("2.Exit(Pess-2)");
        int press = sc.nextInt();
        if (press == 1) {
            menu();
        } else {
            System.out.println("----------THANK YOU----------");
        }
    }

    static void balanceCheck() {

        System.out.println("\n:::::::Balance Checking:::::::");
        available = 0;
        available = balance - 500;
        System.out.println("Main Balance: " + balance + " TK.");
        System.out.println("Avaiable Balance: " + available + " TK.");
        System.out.println("1.Go to main Menu(Pess-1)");
        System.out.println("2.Exit(Pess-2)");
        int press = sc.nextInt();
        if (press == 1) {
            menu();
        } else {
            System.out.println("----------THANK YOU----------");
        }

    }

    static void exit() {
        System.out.println("----------THANK YOU----------");
    }

    static void menu() {

        System.out.println("What you want to do?");
        System.out.println("1.Deposit Money");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Send Money");
        System.out.println("4.Check Balance");
        System.out.println("5.Exit");
        System.out.print("Choose Your Option: ");
        int op = sc.nextInt();
        option(op);

    }

    static void option(int opt) {

        if (opt == 1) {
            depositMoney();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            sendMoney();
        } else if (opt == 4) {
            balanceCheck();
        } else if (opt == 5) {
            exit();

        } else {
            System.out.println("Invalid Input,Please Try again");
            menu();
        }

    }
}
