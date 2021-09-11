package laba1.math.expressions;

import java.util.Scanner;

public class MathFuncResolver {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter h: ");
        double h = in.nextDouble();
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        for (double i = a; i <= b; i += h){
            System.out.println(String.format("%8.4f | %8.4f", i, Math.tan(i)));
            System.out.println("_________|_________");
        }
    }
}
