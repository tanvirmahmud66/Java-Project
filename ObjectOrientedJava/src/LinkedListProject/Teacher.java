
package LinkedListProject;
import java.util.LinkedList;

public class Teacher {
    String name;
    int id;
    
    Teacher(String name,int id){
        this.name = name;
        this.id = id;
    }
    
    
    public static void main(String[] args) {
        
        LinkedList<Teacher> Tchr = new LinkedList<>(); 
        
        Teacher t1 = new Teacher("Tanvir",101);
        Teacher t2 = new Teacher("Emon",102);
        Teacher t3 = new Teacher("Shimanto",103);
        Teacher t4 = new Teacher("Robin",104);
        Teacher t5 = new Teacher("Shafi",105);
        Teacher t6 = new Teacher("Shamiul",106);
        Teacher t7 = new Teacher("Shafin",107);
        Teacher t8 = new Teacher("Tamjid",108);
        Teacher t9 = new Teacher("Mehedi",109);
        Teacher t10 = new Teacher("Shahed",110);
        
        
        Tchr.add(t1);
        Tchr.add(t2);
        Tchr.add(t3);
        Tchr.add(t4);
        Tchr.add(t5);
        Tchr.add(t6);
        Tchr.add(t7);
        Tchr.add(t8);
        Tchr.add(t9);
        Tchr.add(t10);
        
        for(Teacher t: Tchr){
            System.out.println("Name: "+t.name+", Id: "+t.id);
        }
        
        
    }
}
