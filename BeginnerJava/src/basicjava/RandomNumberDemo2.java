package basicjava;

public class RandomNumberDemo2 {

    public static void main(String[] args) {

        int number;
        number = (int) (Math.random() * 10);//return double type value, 0 to 9
        System.out.println(number);
        number = (int) (Math.random() * 10) + 1; //1 to 10
        System.out.println(number);
        number = (int) (Math.random() * 6) + 5; //5 to 10
        System.out.println(number);
        number = (int) (Math.random() * 11) + 10;//10 to 20
        System.out.println(number);

    }

}
