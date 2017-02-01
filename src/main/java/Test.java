import model.entity.Point;
import model.entity.Triangle;
import model.logic.Area;
import model.logic.Perimeter;
import model.logic.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Administrator on 1/29/2017.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Triangle t = new Triangle(new Point(0,1),new Point(5,0),new Point(0,10));
        Triangle s = new Triangle(new Point(15,15),new Point(30,15),new Point(30,31));
        Triangle m = new Triangle(new Point(0,0),new Point(13.99,0),new Point(0,47.73));
        System.out.println("Perimeter : " + Perimeter.countPerimeter(m));
//        System.out.println("Area :" + Area.countArea(t));
//        System.out.println("Side: " + Perimeter.countSide(new Point(0,0),new Point(5,0)));
        System.out.println(Perimeter.isRectangle(m));
    }
}
