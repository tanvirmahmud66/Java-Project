
package File2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        File folder = new File("Authentication");
        folder.mkdir();
        
        File text = new File(folder.getAbsolutePath()+"/pass.txt");
        
        try{
            text.createNewFile();
            try{
                Formatter formatter = new Formatter(text.getAbsolutePath());
                System.out.print("Enter Your Name: ");
                name = sc.nextLine();
                formatter.format("%s",name);
            }catch(FileNotFoundException e){
                System.out.println(e);
            }
        }catch(IOException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
