package Homework4.square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь фигурок \nТреугольника | круга | прямоугольника |=\t");
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(5, 10);
        shape[1] = new Circle(2);
        shape[2] = new Rectangle(2, 4);
        for (Shape sh : shape) {
            System.out.print("     " + sh.AreaOfFigure() + " | ");
        }
    }
}
