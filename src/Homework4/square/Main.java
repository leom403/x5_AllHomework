package Homework4.square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь фигурок \nТреугольника | круга | прямоугольника |=\t");
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle();
        shape[1] = new Circle();
        shape[2] = new Rectangle();
        for (Shape sh: shape){
            System.out.print("     " + sh.SQUARE() + " | ");
        }
    }
}
