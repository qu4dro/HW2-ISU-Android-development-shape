package ru.orlovvv;

public abstract class Shape implements Comparable<Shape> {

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(Shape s) {
        if (getArea() > s.getArea()) return 1;
        if (getArea() < s.getArea()) return -1;

        return  0;
    }
}
