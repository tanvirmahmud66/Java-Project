
package File2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class ValuEntry {
    public static void main(String[] args) {
        String name;
        int id;
        File entry = new File("F:/My code/Java/ObjectOrientedJava/Password/Entry.txt");
        
        try{
            entry.createNewFile();
            Formatter formatter = new Formatter(entry.getAbsolutePath());
            
            Scanner sc = new Scanner(System.in);
            System.out.print("How much you want to Entry name?\nNumber: ");
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.print("Enter Name And ID: ");
                id = sc.nextInt();
                name = sc.next();
                formatter.format("%s %s\r\n",id,name);
            }
            
            formatter.close();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
