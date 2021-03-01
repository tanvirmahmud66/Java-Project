package arrayjava;

public class ArrayFrequencyDemo {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 1, 2, 6, 1, 2, 4, 4, 2, 3, 8, 7};
        int fre[] = new int[a.length];

        //displaying first Array Element
        System.out.println("Array A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int visited = -1;

        // frequency for each Element of array a
        System.out.println("Array Frequency: ");
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    //to avoid counting same element Again
                    fre[j] = visited;
                }
            }
            if (fre[i] != visited) {
                fre[i] = count;
            }
        }

        //displaying Frequency Array
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] != visited) {
                System.out.print(fre[i] + " ");
            }
        }
        System.out.println();

    }

}
