package basicjava;

import java.util.Random;

public class RandomNumberDemo {

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(10); //o to 9
        System.out.println(number);
        number = rand.nextInt(10) + 1; //1 to 10
        System.out.println(number);
        number = rand.nextInt(6) + 5; //5 to 10
        System.out.println(number);
        number = rand.nextInt(11) + 10; //5 to 10
        System.out.println(number);

    }

}
