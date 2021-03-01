package stringjava;

public class StringDemo4 {

    public static void main(String[] args) {

        String name = "    Tanvir Mahmud Fahim  ";
        System.out.println(name);

        //trimig initial and las space from string
        String name2 = name.trim();
        System.out.println(name2);

        //replace specific char from string srting.replace('old char','new char')
        String name3 = name2.replace('i', 'e');
        System.out.println(name3);

        //deleting all space/char you want from string, return string array value 
        String name4[] = name2.split(" ");
        for (String x : name4) {
            System.out.print(x);
        }
        System.out.println();

        //for specific charecter
        char ch = name.charAt(0);
        System.out.println("ch = " + ch);
        ch = name2.charAt(5);
        System.out.println("ch = " + ch);
        ch = name2.charAt(8);
        System.out.println("ch = " + ch);

        //ASCII value for specific index
        int ascii = name2.codePointAt(0);
        System.out.println("ASCII value: " + ascii);
        ascii = name2.codePointAt(5);
        System.out.println("ASCII value: " + ascii);
        ascii = name2.codePointAt(8);
        System.out.println("ASCII value: " + ascii);

        //index number for specific char from string and show the first index for that char if there are many
        int index = name2.indexOf("M");
        System.out.println("position of M: " + index);
        index = name2.indexOf("T");
        System.out.println("position of T: " + index);
        index = name2.indexOf("m");
        System.out.println("position of m: " + index);
        index = name2.indexOf("a");
        System.out.println("position of a: " + index);

        //index number for specific char from string and show the last index for that char if there are many
        int pos = name2.lastIndexOf("a");
        System.out.println("Last positon of a: " + pos);

    }

}
