package model;

import model.entity.Point;
import static org.junit.Assert.*;

import model.entity.Triangle;
import model.logic.Area;
import model.logic.Perimeter;
import model.logic.Reader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTriangle {
//    private  Triangle triangle;
//
//    @Before
//    public void init(){
//
//        System.out.println("init");
//    }
//    @After
//    public void destroy(){
//        triangle = null;
//        System.out.println("destroy");
//    }


    @Test
    public void testSizeCounter(){
        Point p1 = new Point(5,9);
        Point p2 = new Point(4,2);
        double result = 7.07;
        assertEquals(result, Perimeter.countSide(p1,p2),0.01);
    }

    @Test
    public void testIsRectangle(){
        Triangle triangle =  new Triangle(new Point(0,0),new Point(10,0),new Point(0,40));
        assertEquals(true,Perimeter.isRectangle(triangle));
    }
    @Test
    public void testIsRectangleFalse(){
        Triangle triangle =  new Triangle(new Point(0.4,0),new Point(10,0),new Point(0,40));
        assertEquals(false,Perimeter.isRectangle(triangle));
    }
    @Test
    public void testAreaCounter(){
       Triangle tr = new Triangle(new Point(15.4,13.8),new Point(21,25.5),new Point(3.6,5.2));
       double result = 44.95;
       assertEquals(result, Area.countArea(tr),0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAreaCounterException(){
        Triangle tr = new Triangle(new Point(0,2),new Point(0,5),new Point(0,8));
        double result = 10;
        assertEquals("Error",result, Area.countArea(tr),0.1);
    }

    @Test
    public void testIsRectangleRightTrue()
    {
        double a = 5.0;
        double b = 4.0;
        double c = 6.4;
        assertEquals(true,Perimeter.isRectangleRight(a,b,c));

    }
    @Test
    public void testIsRectangleRightFalse()
    {
        double a = 5.0;
        double b = 4.0;
        double c = 6.2;
        assertEquals(false,Perimeter.isRectangleRight(a,b,c));

    }
    @Test
    public void testCastStringArrayToDoubleArray(){
        String[] array = {"10.33","20.44","18.43","33.43","88.00","99.00"};
        double[] arrayDouble ={10.33,20.44,18.43,33.43,88.00,99.00};
        assertArrayEquals(arrayDouble, Reader.castStringArrayToDoubleArray(array),0.1);
    }

    @Test
    public void testInitTriangle(){
        String text = "10.33 20.44 18.43 33.43 88.00 99.00";
        Triangle triangle = new Triangle(new Point(10.33,20.44),
                new Point(18.43,33.43), new Point(88.00,99.00));
        assertEquals(triangle,Reader.initTriangle(text));
    }

}
