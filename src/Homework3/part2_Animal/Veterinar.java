package Homework3.part2_Animal;

public class Veterinar {

    public void treatAnimal(Animal animal) {
        System.out.println("\nЭто животное ест: " + animal.getFood() + " и живёт в " + animal.getLocation());
    }

}
