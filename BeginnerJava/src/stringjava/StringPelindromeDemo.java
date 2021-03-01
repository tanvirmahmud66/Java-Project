package stringjava;

public class StringPelindromeDemo {

    public static void main(String[] args) {

        String s1 = "mam";
        StringBuffer sb = new StringBuffer(s1);

        //.toStirng use for StringBuffer turn into String
        String s2 = sb.reverse().toString();

        if (s2.equals(s1)) {
            System.out.println("Pelindrom");
        } else {
            System.out.println("Not pelindrome");
        }

    }

}
