package stringjava;

public class StringDemo2 {

    public static void main(String[] args) {

        String firstName = "Tanvir";
        String lastName = " Mahmud";
        String names[] = {"Fahim","Joy","Shibly","Shourov","Gourov"};

        String fullName = firstName + lastName;
        System.out.println(fullName);

        //concat method Add two String
        String fullyname = firstName.concat(lastName);
        System.out.println("FullName = " + fullyname);

        String upper = fullyname.toUpperCase();
        System.out.println("Upper Case: " + upper);

        String lower = fullyname.toLowerCase();
        System.out.println("lower Case: " + lower);

        boolean start = firstName.startsWith("t");//not matching with fisrtName Var.
        System.out.println(start);

        start = lower.startsWith("tan");
        System.out.println(start);

        boolean last = lastName.endsWith("mud");
        System.out.println(last);
        
        last = lastName.endsWith("D");
        System.out.println(last);
        
        last = lower.endsWith("d");
        System.out.println(last);
        
        last = upper.endsWith("MUD");
        System.out.println(last);
        
        

    }

}
