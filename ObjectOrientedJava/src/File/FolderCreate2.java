
package File;

import java.io.File;

public class FolderCreate2 {
    public static void main(String[] args) {
        /*
        if you want to create folder where you want
        thn copy the path and last a name dite hobe :)
        */
        
        File fldr = new File("C:/Users/cbz/Desktop/Fahim");
        
        fldr.mkdir();
        String Location = fldr.getAbsolutePath();
        System.out.println(Location);
        
        //if you want to see this folder comment out this delete method :)
        fldr.delete();
        
    }
}
