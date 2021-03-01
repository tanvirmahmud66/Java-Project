
package File;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteTxtFileDemo {
    public static void main(String[] args) {
        
        try{
            Formatter writeFile = new Formatter("F:/My code/Java/ObjectOrientedJava/Documen/Teacher.txt");
            
            writeFile.format("%s &s\r\n","101","Fahim");
            writeFile.format("%s &s\r\n","102","Tanvir");
            writeFile.format("%s &s","103","Mahmud");
            
            writeFile.close();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        
    }
}
