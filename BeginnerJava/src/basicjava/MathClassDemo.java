package basicjava;

import java.util.Scanner;

public class MathClassDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double e = Math.E; //return double value
        System.out.println("E = " + e);
        double Pi = Math.PI; //return double value
        System.out.println("Pi = " + Pi);

        //Return Absolute Value
        double a = -3.26598943;
        System.out.println("a = " + Math.abs(a));//return double value
        float b = -3.26598943f;
        System.out.println("a = " + Math.abs(b));//return float value
        long c = -256555655;
        System.out.println("c = " + Math.abs(c));//return long value
        int d = -256555655;
        System.out.println("d = " + Math.abs(d));//return long value

        //Sum of two int value (addExact)
        int f = 25;
        int g = 10;
        int fg;
        long gf;
        System.out.println("fg = " + Math.addExact(f, g));//return int value
        System.out.println("gf = " + Math.addExact(f, g));//return long value(variable int||long)

        //cube root
        System.out.print("Enter number for cube root: ");
        double root = input.nextDouble();
        System.out.println("Root = " + Math.cbrt(root));

        //cos
        System.out.print("Enter Number for cos: ");
        double cos = input.nextDouble();
        System.out.println("cos = " + Math.cos(cos));

        //tan
        System.out.print("Enter Number for tan: ");
        double tan = input.nextDouble();
        System.out.println("cos = " + Math.tan(tan));

        //decrementExact(decrement by one)
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        System.out.println("Number = " + Math.decrementExact(num));//return int||long also

        //exp
        System.out.print("Enter number: ");
        double exp = input.nextDouble();
        System.out.println("exp = " + Math.exp(exp));

        //incrementExact
        System.out.print("Enter Number: ");
        int num2 = input.nextInt();
        System.out.println("Increment by one: " + Math.incrementExact(num2));//decrement by one(int||long)

        //exponent
        System.out.print("Enter Number: ");
        double num3 = input.nextInt();
        System.out.println("Exponent: " + Math.getExponent(num3));

        //Square Root
        System.out.print("Enter Number for root: ");
        double sqrt = input.nextDouble();
        System.out.println("Square Root: " + Math.sqrt(sqrt));//return double value

        //log(base e) / ln
        System.out.print("Enter Number for log Calculation: ");
        double log = input.nextDouble();
        System.out.println("Log of number is: " + Math.log(log));//return double

        //hypot = sqrt(x^2 + Y^2)
        System.out.print("Enter X: ");
        double x = input.nextDouble();
        System.out.print("Enter Y: ");
        double y = input.nextDouble();

        System.out.println("Hypo Calculation is: " + Math.hypot(x, y));//return double value

        //log10 (base 10)
        System.out.print("Enter Number Logarithm: ");
        double log10 = input.nextDouble();
        System.out.println("Log10 = " + Math.log10(log10));//return double value

        //max between to number
        System.out.print("Enter 1st number: ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = input.nextInt();
        System.out.println("Maximum is: " + Math.max(n1, n2));//return int||double||float||long

        //min between twp number
        System.out.print("Enter 1st number: ");
        int nu1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int nu2 = input.nextInt();
        System.out.println("Minimum is: " + Math.min(nu1, nu2));//return int||double||float||long

        //multiplyExact between two number
        System.out.print("Enter 1st number: ");
        int m1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int m2 = input.nextInt();
        System.out.println("Ans: " + Math.multiplyExact(m1, m2));//return value int||long

        //power
        System.out.print("Enter a number: ");
        double pow1 = input.nextDouble();
        System.out.print("Enter power number: ");
        double pow2 = input.nextDouble();
        System.out.println("Power is: " + Math.pow(pow1, pow2));

        //Round
        System.out.print("Enter a double number: ");
        double rou = input.nextDouble();
        System.out.println("Round = " + Math.round(rou));//return value double||float

        //sin
        System.out.print("Enter number for sin: ");
        double sin = input.nextDouble();
        System.out.println("Sin is: " + Math.sin(sin));

        //Subtracts
        System.out.print("Enter 1st number: ");
        int h = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int j = input.nextInt();
        System.out.println("Sub is: " + Math.subtractExact(h, j));//return value int||long

    }

}
