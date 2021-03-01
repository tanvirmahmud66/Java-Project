package arrayjava;

public class Array2DDemo2 {

    public static void main(String[] args) {

        int a[][] = new int[4][];//we know how much row but column is unknown
        int k = 0;
        //a[row] = new int[col]....each row have diferent col
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[4];

        //Assigning value
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row + 1; col++) {
                a[row][col] = k;
                k++;
            }
        }

        //printing
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

    }

}
