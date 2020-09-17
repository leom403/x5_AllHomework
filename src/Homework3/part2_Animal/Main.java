package Homework3.part2_Animal;

public class Main {

    public static void main(String[] args) {
//Массив живности
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Meow", "Small", true, "fish", "Home");
        animal[1] = new Dog("Bark! Bark!", "Middle", "Bpnes", "Dog pound");
        animal[2] = new Horse("I-go-go", "Tall",4,true, "Oast", "Preries" );

        System.out.println(animal[0]);
        for (int i = 0; i < animal.length; i++) {
            Veterinar veterinar = new Veterinar();
            veterinar.treatAnimal(animal[i]);
        }
    }
}
