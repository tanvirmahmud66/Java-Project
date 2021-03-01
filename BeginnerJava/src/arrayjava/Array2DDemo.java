package arrayjava;

public class Array2DDemo {

    public static void main(String[] args) {

        int a[][] = new int[4][5];
        int k = 0;

        //Assignment value
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                a[row][col] = k;
                k++;
            }
        }

        //printing value
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" " + a[row][col]);
            }
            System.out.println();
        }

    }

}
