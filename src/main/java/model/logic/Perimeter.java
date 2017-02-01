package model.logic;

import model.entity.Point;
import model.entity.Triangle;

import java.util.Map;

/**
 * Created by Administrator on 1/30/2017.
 */
public class Perimeter {
    public static double countPerimeter(Triangle t) {
        double sideA = countSide(t.getOne(), t.getTwo());
        double sideB = countSide(t.getTwo(), t.getThree());
        double sideC = countSide(t.getThree(), t.getOne());
        System.out.println("Perimeter : " + sideA + ", " + sideB + ", " + sideC + ", ");
        return sideA + sideB + sideC;
    }

    public static double countSide(Point a, Point b) {
        double d = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
        return (double) Math.round(d * 100) / 100;
    }

    public static boolean isRectangle(Triangle t) {
        double sideA = countSide(t.getOne(), t.getTwo());
        double sideB = countSide(t.getTwo(), t.getThree());
        double sideC = countSide(t.getThree(), t.getOne());
        if (isRectangleRight(sideA, sideB, sideC) || isRectangleRight(sideB, sideC, sideA) || isRectangleRight(sideA, sideC, sideB))
            return true;
        else
            return false;
    }

    public static boolean isRectangleRight(double a, double b, double c) {
//        return (double)Math.round(a * a * 10) / 10 + (double)Math.round(b * b * 10) / 10 == (double)Math.round(c * c * 10) / 10;
        return (double) Math.round(a * a) + (double) Math.round(b * b) == (double) Math.round(c * c);
    }
}
