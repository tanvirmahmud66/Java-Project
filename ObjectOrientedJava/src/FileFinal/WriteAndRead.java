package FileFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteAndRead {
    public static void main(String[] args) {
        File file = new File("Fahim.txt");
        //write file
        try {
            PrintWriter write = new PrintWriter(file);
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Name: ");
            String name = scan.nextLine();
            write.append(name);
            write.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        
        //read file
        try {
            Scanner sc = new Scanner(file);

            //int code = sc.nextInt();
            while (sc.hasNext()) {
                String name = sc.nextLine();
                System.out.println(name);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
