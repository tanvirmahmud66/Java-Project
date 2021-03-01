package arrayjava;

public class ArrayCopyDemo {

    public static void main(String[] args) {

        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int y[] = new int[x.length];

        //copy array value to another array
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];

        }

        //displaying orginal value of array X
        System.out.println("Orginal Value of Array X: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        //displaying copy value of Array x in new Array Y
        System.out.println("New Array Y: ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }

    }

}
