package ru.academit.yugay.shape;

import ru.academit.yugay.shape.Shape;

public class Square extends Shape {
    private double lenghtSize;


    public Square(double lenghtSize) {
        this.lenghtSize = lenghtSize;
    }

    public double getWidth() {
        return 0;
    }

    public double getHeight() {
        return 0;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }


    public void getLenghtSize() {
        System.out.println(lenghtSize);
    }

}
