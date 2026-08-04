package org.example.oops;

public class Poly {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();

        Rectangle rectangle = new Rectangle();
        rectangle.area();
    }
}

interface shape{
    void area();
}
class Circle implements shape{

    @Override
    public void area() {
        System.out.println("area of circle is pi*r*r");
    }
}

class Rectangle implements shape{

    @Override
    public void area() {
        System.out.println("area of rectangle is side*side");
    }
}
