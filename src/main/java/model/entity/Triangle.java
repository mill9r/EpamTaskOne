package model.entity;

import model.entity.Point;

public class Triangle {
    private Point one;
    private Point two;
    private Point three;

    public Triangle(Point one, Point two, Point three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public Point getOne() {
        return one;
    }

    public Point getTwo() {
        return two;
    }

    public Point getThree() {
        return three;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (one != null ? !one.equals(triangle.one) : triangle.one != null) return false;
        if (two != null ? !two.equals(triangle.two) : triangle.two != null) return false;
        return three != null ? three.equals(triangle.three) : triangle.three == null;
    }

    @Override
    public int hashCode() {
        int result = one != null ? one.hashCode() : 0;
        result = 31 * result + (two != null ? two.hashCode() : 0);
        result = 31 * result + (three != null ? three.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                '}';
    }
}
