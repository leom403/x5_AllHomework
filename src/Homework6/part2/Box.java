package Homework6.part2;

import java.util.*;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

public Box() {

}
    public float getWeight() {
        float weight = 0.0f;
//общий вес в коробке

    for (T totalWeight : box) {
        weight += totalWeight.getWeight();
    }
    return weight;
}
//добавляем фрукты в коробку с фруктами
public void addFruitsInBox(T fruit, int count){
    for (int i = 0; i < count ; i++) {
        box.add(fruit);
    }
}
//метод для сравнения веса коробок
public boolean compareBoxes(Box oneAnotherBox) {
    if (getWeight() == oneAnotherBox.getWeight()) return true;
    else {
        return false;
    }
    }
//Пересыпание
    public void moveToNewBox(Box <T>oneAnotherBox) {
        oneAnotherBox.box.addAll(box);                  //ссыпаем в новую
        box.clear();                                    //чистим
    }
}