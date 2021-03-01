package This_Keyword;

public class Person {

    String name;
    int age;
    String profession;

    Person(String name, int age) {
        //for detect instance variable use this keyword
        this.name = name;
        this.age = age;
    }
    
    Person(String name, int age, String profession){
        //we call call constructor by using this keyword
        this(name,age);
        this.profession = profession;
        
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("Preofession: "+profession);
    }

}
