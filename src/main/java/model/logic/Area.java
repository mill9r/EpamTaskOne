package model.logic;

import model.entity.Triangle;

/**
 * Created by Administrator on 1/29/2017.
 */
public class Area {

    public static double countArea(Triangle t) throws IllegalArgumentException {
        double a = t.getOne().getX() * (t.getTwo().getY() - t.getThree().getY());
        double b = t.getTwo().getX() * (t.getThree().getY() - t.getOne().getY());
        double c = t.getThree().getX() * (t.getOne().getY() - t.getTwo().getY());
        double area = (a + b + c) / 2;
        if(area==0){
            throw new IllegalArgumentException();
        }
        return area;
    }


}
