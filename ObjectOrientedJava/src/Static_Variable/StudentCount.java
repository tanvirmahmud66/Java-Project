package Static_Variable;

public class StudentCount {

    static int count = 0;

    StudentCount() {
        count++;
    }
    
    //to show how much object are created
    void totalt() {
        System.out.println("Total Student = " + count);
    }

    public static void main(String[] args) {

        StudentCount ob1 = new StudentCount();
        ob1.totalt();

        StudentCount ob2 = new StudentCount();
        ob2.totalt();

        StudentCount ob3 = new StudentCount();
        ob3.totalt();

        StudentCount ob4 = new StudentCount();
        ob4.totalt();

        StudentCount ob5 = new StudentCount();
        ob5.totalt();

    }

}
