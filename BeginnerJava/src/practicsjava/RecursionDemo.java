package practicsjava;

public class RecursionDemo {

    int add(int num) {
        int sum = 0;
        if (num == 1) {
            return 1;
        } else {
            return num * add(num - 1);
        }
    }

    public static void main(String[] args) {

        RecursionDemo ob = new RecursionDemo();
        int result = ob.add(5);
        System.out.println("Result = " + result);

    }

}
