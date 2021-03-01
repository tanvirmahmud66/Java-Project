package Polymorphism;

public class Test {

    public static void main(String[] args) {

        /* 
        >>>reference variable "p" can
        refer different class object
        
        >>>reference varable must be 
        from Super class/mother class
         */
        Person p = new Person();
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();

    }
}
