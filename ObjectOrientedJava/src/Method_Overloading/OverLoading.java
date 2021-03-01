package Method_Overloading;

public class OverLoading {

    //Method OverLoading
    //Method name must be same and peremeter must be defferent
    //class must be same
    void add() {
        System.out.println("Nothin for Add");
    }

    void add(float a, float b) {
        System.out.println("Add of integer value: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Add for two double value: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Add for three int value: " + (a + b + c));
    }

    public static void main(String[] args) {

        OverLoading ob = new OverLoading();

        ob.add();
        ob.add(5, 3);
        ob.add(5, 3);
        //ob.add(5.263, 2.26);
        ob.add(5, 3, 7);

    }

}
