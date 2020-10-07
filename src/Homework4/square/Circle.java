package Homework4.square;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double figureSquare() {
        return Math.PI * radius * radius;
    }
}