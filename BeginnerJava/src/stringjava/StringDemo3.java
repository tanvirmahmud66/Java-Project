package stringjava;

public class StringDemo3 {

    public static void main(String[] args) {

        String firstname = "abdur";
        String lastname = " rashid";

        String fullname = firstname.concat(lastname);
        System.out.println(fullname);

        boolean start = fullname.startsWith("ab");
        System.out.println("Start = " + start);

        boolean end = fullname.endsWith("d");
        System.out.println("End = " + end);

        String upper = fullname.toUpperCase();
        System.out.println("Upper = " + upper);

        String lower = fullname.toLowerCase();
        System.out.println("Lower = " + lower);

    }

}
