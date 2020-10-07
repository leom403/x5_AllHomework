package Homework4.square;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double length, double height) {
        this.a = length;
        this.b = height;
    }

    @Override
    public double figureSquare() {
        return a * b;
    }
}
