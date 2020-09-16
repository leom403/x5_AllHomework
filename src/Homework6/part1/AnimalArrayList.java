package Homework6.part1;

import java.util.List;
import java.util.ArrayList;


class AnimalArrayList {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<>();
        animalList.add("Cougar");
        animalList.add("Coconut");
        animalList.add("Lion");
        animalList.add("Koala");
        animalList.add("Table"); //стол - не животное
        animalList.add("Bear");

        System.out.println(animalList);

//Размер массива
        System.out.println("Элементов в массиве: " + animalList.size());

//Добавление
        animalList.add("Wolf");
        System.out.println("Добавили волка в конец: " + animalList);
//Удадение по индексу
        animalList.remove(3);
        System.out.println("Удалили стол по индексу: " + animalList);
//Удаление элемента
        animalList.remove("Coconut");
        System.out.println("Убираем кокос: " + animalList);
//Получение по индексу
        System.out.println("Кто царь зверей: " + animalList.get(1));
//Очистить коллекию
        animalList.clear();
        System.out.println(animalList);
    }
}
