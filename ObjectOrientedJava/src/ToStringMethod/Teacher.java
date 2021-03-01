
package ToStringMethod;

public class Teacher {
    
    String name;
    int age;
    
    Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name:"+name+"\nAge"+age;
    }
    
    
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher("Tanvir",34);
        Teacher t2 = new Teacher("Mahmud",34);
        
        System.out.println(t1);
        System.out.println(t2);
        
    }
}
