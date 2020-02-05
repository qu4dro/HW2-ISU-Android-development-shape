package ru.orlovvv;

public class Rect extends Shape{
    private double a, b, c;

    public Rect(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return Math.sqrt((getPerimeter() / 2) * (getPerimeter() / 2 - a) * (getPerimeter() / 2 - b) * (getPerimeter() / 2) - c);
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
