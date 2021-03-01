package stringjava;

public class WrapperClassDemo {

    public static void main(String[] args) {

        //primitive -> object
        int x = 50;
        Integer y = Integer.valueOf(x);
        System.out.println("Y = " + y);

        //Shortcut way
        Integer z = x; //integer.valueOf(x) -> Autoboxing
        System.out.println("Y = " + y);

        //Object -> primitive data type
        Integer d = new Integer(115);
        System.out.println("d = " + d);
        int e = d.intValue();
        System.out.println("e = " + e);

        //Shortcut way
        e = d; //d.intValue() -> unboxing
        System.out.println("e = " + e);

    }

}
