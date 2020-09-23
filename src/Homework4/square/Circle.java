package Homework4.square;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircleSquare() {
        return Math.PI * radius * radius;
    }


    @Override
    public double AreaOfFigure() {
        return getCircleSquare();
    }
}