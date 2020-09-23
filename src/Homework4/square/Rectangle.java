package Homework4.square;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double length, double height) {
        this.a = length;
        this.b = height;
    }

    public double getCircleSquare() {
        return a * b;
    }

    @Override
    public double AreaOfFigure() {
        return getCircleSquare();
    }
}
