package stringjava;

public class StringPelindromeDemo2 {

    public static void main(String[] args) {

        String s1 = "maam";

        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();

        if (s2.equals(s1)) {
            System.out.println("Pelindrome");
        } else {
            System.out.println("Not Pelindrome");
        }

    }

}
