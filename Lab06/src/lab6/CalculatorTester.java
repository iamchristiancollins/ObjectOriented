package lab6;

import java.util.Scanner;

public class CalculatorTester {

    public static void main(String[] args) {

        System.out.println("First Number: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Second Number: ");
        int num2 = in.nextInt();
        in.close();




        ScientificCalculator sciCal = new ScientificCalculator(num1, num2);

        System.out.println(sciCal.add());
        System.out.println(sciCal.mult());
        System.out.println(sciCal.divide());
        System.out.println(sciCal.sqrt());
        System.out.println(sciCal.exponent());

    }
}
