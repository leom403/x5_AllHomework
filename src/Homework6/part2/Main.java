package Homework6.part2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
//еще 2 коробки для пересыпания
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox.addFruitsInBox(new Apple(), 5);
        orangeBox.addFruitsInBox(new Orange(), 10);

//еще 2 коробки для пересыпания
        appleBox2.addFruitsInBox(new Apple(), 0);
        orangeBox2.addFruitsInBox(new Orange(), 0);
//проверка работы веса
        System.out.println("1: " + appleBox.getWeight() + "2:" + orangeBox.getWeight());
//сравнить вес, должно быть тру
        System.out.println(appleBox2.compareBoxes(orangeBox2));
//пересыпаем (5в0 и ошибка на этапе компилляции - разные типы в коробке)

        appleBox.moveToNewBox(appleBox2);
//        appleBox.moveToNewBox(orangeBox2);                // Error:(25, 31) java: incompatible types: Homework6.part2.Box<Homework6.part2.Orange> cannot be converted to Homework6.part2.Box<Homework6.part2.Apple>
        System.out.println(appleBox.getWeight() + "->" + appleBox2.getWeight());
        System.out.println(+appleBox.getWeight() + " -/>" + orangeBox2.getWeight()) ;
    }
}