package laba1.math.expressions;

import java.awt.*;
import java.util.Scanner;

public class PointDeterminant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        Point point = new Point(x, y);
        if (isPointInSquare(point)){
            System.out.println("point in square");
        }
        else{
            System.out.println("point not in square");
        }
    }

    public static boolean isPointInSquare(Point point) {
        if (point.y >= 0 && point.y <= 5 && point.x >= -4 && point.x <= 4) {
            return true;
        } else
            return point.y >= -3 && point.y <= 0 && point.x >= -6 && point.x <= 6;
    }
}
