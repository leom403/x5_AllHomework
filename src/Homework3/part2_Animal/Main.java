package Homework3.part2_Animal;

public class Main {

    public static void main(String[] args) {
//Массив живности
        Animal[] animal = new Animal[3];
        animal[0] = new Cat();
        animal[1] = new Dog();
        animal[2] = new Horse();

//конец массива
//новый кот
        Animal animal1 = new Cat();
//код для того, что бы узнать, что кушает собакен и где живет
        Dog dog2 = new Dog();
        String dog2Food = dog2.getFood();
        String dog2Location = dog2.getLocation();
        System.out.println("\tПес ест: " + dog2Food + "\n\tПес живет: " + dog2Location);

        Animal animal2 = new Dog();
        Animal animal3 = new Horse();


        animal1.eat();                   //про кису
        animal2.makeNoise();            //про пселя
        animal3.makeNoise();            //про коняшку

        for (int i = 0; i < animal.length; i++) {
            Veterinar veterinar = new Veterinar();
            veterinar.treatAnimal(animal[i]);
        }
    }
}
