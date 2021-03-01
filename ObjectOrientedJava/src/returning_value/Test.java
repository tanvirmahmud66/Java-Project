package returning_value;

public class Test {

    public static void main(String[] args) {
        
        ReturningValueDemo ob1 = new ReturningValueDemo();
        int result = ob1.Square(5);
        System.out.println("Square of 5 is: " + result);
        
        ReturningValueDemo ob2 = new ReturningValueDemo();
        System.out.println("Cube of 3 is: " + ob2.Cube(3));
        
        ReturningValueDemo ob3 = new ReturningValueDemo();
        System.out.println("Double value is: " + ob3.dou(125.36));
    }
    
}
