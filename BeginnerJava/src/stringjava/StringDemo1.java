package stringjava;

public class StringDemo1 {

    public static void main(String[] args) {

        String x = "tanVir mahmud";
        String y = new String("tanvir mahmud");
        String z = "";

        //char type array also work like string
        //when you see the output you can understand
        char a[] = {'f', 'a', 'h', 'i', 'm'};
        System.out.println(a);

        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        //string lenth
        int len = x.length();
        System.out.println("Lenth of X: " + len);
        len = y.length();
        System.out.println("Lenth of y: " + len);

        /*if string element have upper lower case issue then
        use string.equalsignoringcsar();
         */
        if (x.equals(y)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (x.equalsIgnoreCase(y)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        //checking specific sting contains or not in main string
        boolean check = x.contains("mahmud");
        System.out.println(check);

        //checking String Empt or not
        boolean emp = x.isEmpty();
        System.out.println(emp);
        emp = z.isEmpty();
        System.out.println(emp);

    }

}
