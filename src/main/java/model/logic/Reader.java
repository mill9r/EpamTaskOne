package model.logic;


import model.entity.Point;
import model.entity.Triangle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Reader {

    public static Triangle readFromFile() {
        String text = "";
        try {
            Scanner in = new Scanner(new FileReader("d:/a.txt"));
            while (in.hasNext()) {
                text += in.nextLine() + " ";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return initTriangle(text);
    }

    public static Triangle initTriangle(String text) {
        String[] array = text.split(" ");
        double[] points = castStringArrayToDoubleArray(array);
        return new Triangle(new Point(points[0], points[1]), new Point(points[2], points[3]), new Point(points[4], points[5]));
    }

    public static double[] castStringArrayToDoubleArray(String[] array) {
        double[] doublesArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("([0-9]*)\\.([0-9]*)"))
                doublesArray[i] = Double.parseDouble(array[i]);
        }
        return doublesArray;
    }
}
