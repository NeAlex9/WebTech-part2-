package laba1.math.expressions;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("result = " + figureOut(x, y));
    }

    private static double figureOut(int x, int y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denumerator = 2 + Math.abs(x - 2 * x / (1 + Math.pow(x * y, 2)));
        return numerator / denumerator + x;
    }
}
