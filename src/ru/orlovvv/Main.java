package ru.orlovvv;

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rect r = new Rect(4,2,3);
        Square s = new Square(3);

        print(c);
        print(r);
        print(s);

        compareArea(c,r);
        compareArea(s,c);
    }

    private static void print(final Shape s) {
        System.out.printf("Values: area = %s perimeter = %s \n", s.getArea(), s.getPerimeter());
    }

    private static void compareArea(final Shape s, final Shape s2) {
        if (s.getArea() > s2.getArea()) {
            System.out.println("first area is bigger");
        } else {
            System.out.println("second area is bigger");
        }
    }
}
