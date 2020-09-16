package Homework6.part1;

import java.util.List;
import java.util.LinkedList;

class FruitLinkedList {
    public static void main(String[] args) {

        String fruit1 = "Apple";
        String fruit2 = "Coconut";
        String fruit3 = "Kiwi";
        String fruit4 = "Orange";
        String fruit5 = "Banana";

        List<String> list = new LinkedList<>();
        list.add(fruit1);
        list.add(fruit2);
        list.add(fruit3);
        list.add(fruit4);
        list.add(fruit5);

        System.out.print(list);
//Размер массива
        System.out.println("Элементов в массиве: " + list.size());

//Добавление
        list.add("Wolf");
        System.out.println("Добавили волка в конец: " + list);
//Удадение по индексу
        list.remove(3);
        System.out.println("Удалили по индексу: " + list);
//Удаление элемента
        list.remove("Coconut");
        System.out.println("Убираем кокос: " + list);
//Получение по индексу
        System.out.println("Зеленый и волосатый фрукт " + list.get(1));
//Очистить коллекуию
        list.clear();
        System.out.println(list);
    }
}
