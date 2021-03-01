
package File2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReadFromFile {
    public static void main(String[] args) {
        
        try{
            File file = new File("F:/My code/Java/ObjectOrientedJava/Password/Entry.txt");
            Scanner sc = new Scanner(file);
            
            while(sc.hasNext()){
                String id = sc.next();
                String name = sc.next();
                System.out.println("Id: "+id+" Name: "+name);
            }
            sc.close();
            
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
    }
}
