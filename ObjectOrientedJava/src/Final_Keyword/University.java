package Final_Keyword;

public class University {

    //if we use final thn we can't modife this variable/method/constructor
    final String name = "SUB";
    final int fees; //static blank final variable    
    

    //use constructor to initialinzingblank final variable 
    
    University(){
        fees = 42000;
    }
       
    
    void display() {

        System.out.println(name);
        System.out.println(fees);
    }

}
