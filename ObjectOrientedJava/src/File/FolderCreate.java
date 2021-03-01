
package File;

import java.io.File;

public class FolderCreate {
    public static void main(String[] args) {
        
        File dir = new File("Person");
        dir.mkdir(); //diractory/folder will be created
        
        System.out.println(dir.getName()); //this method will show the name of diractory/Folder
        
        String path = dir.getAbsolutePath();//this method will show the path of Folder
        System.out.println(path);
        
        dir.delete(); //this method will deleted the folder
        
        
        
    }
}
