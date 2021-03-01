package stringjava;

public class StringDemo6 {

    public static void main(String[] args) {

        String s = "Tanvir";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

        sb.append(" Mahmud");
        sb.append(" Fahim ");
        sb.append(100);
        sb.append(12.5);

        System.out.println(sb);
        System.out.println(sb.length());

        sb.delete(20, 27);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }

}
