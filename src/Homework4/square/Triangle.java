package Homework4.square;

public class Triangle implements Shape {

    private double b;
    private double h;

    public Triangle(double baseOfTriangle, double theHeightOfTheTriangle) {
        this.b = baseOfTriangle;
        this.h = theHeightOfTheTriangle;
    }

    public double getCircleSquare() {
        return (b / 2) * h;
    }

    @Override
    public double figureSquare() {
        return getCircleSquare();
    }
}
