package File;

import java.io.File;

public class TxtFileCreateDemo {

    public static void main(String[] args) {
        //creating folder
        File doc = new File("Document");
        doc.mkdir();

        //selecting location and intial level of txt file creating 
        File text1 = new File(doc.getAbsolutePath() + "/Student.txt");
        File text2 = new File(doc.getAbsolutePath() + "/Teacher.txt");

        //creating file into try & catch for further Exception Handilng
        try {

            text1.createNewFile(); //this method for creating file
            text2.createNewFile();//this method for creating file
            System.out.println("Files Are Created");

        } catch (Exception e) {
            System.out.println(e);
        }
        
        //to delete 
        //text2.delete();
        
        //to check exixtence
        System.out.println(text1.exists());
        
    }
}
