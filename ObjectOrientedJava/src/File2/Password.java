
package File2;

import java.io.File;
import java.util.Formatter;

public class Password {
    public static void main(String[] args) {
        
        File secure = new File("Password");
        secure.mkdir();
        
        File text = new File(secure.getAbsolutePath()+"/pass.txt");
        
        try{
            text.createNewFile();
            Formatter formatter = new Formatter(text.getAbsolutePath());
            
            formatter.format("%s %s\r\n","101","Fahim");
            formatter.format("%s %s\r\n","102","Ayesha");
            formatter.format("%s %s\r\n","103","Tanvir");
            formatter.format("%s %s\r\n","104","Tithi");
            formatter.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
