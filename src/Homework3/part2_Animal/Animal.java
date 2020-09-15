//Хм.. а если в задаче указано, что Класс Animal содержит методы makeNoize, eat, sleep, это значит, что ничего нового в нём создавать нельзя?

package Homework3.part2_Animal;

public class Animal {

    private String food;                       //сколько кушает еды
    private String location;                   //где живет

    public Animal() {

    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное шумит");

    }

    public void eat() {
        System.out.println("Животное кушает");

    }

    public void sleep() {
        System.out.println("Животное спит");

    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

}