package Homework3.part2_Animal;

public class Dog extends Animal {
    private String say = "Bark! Bark!";
    private String size = "Middle";
    private String food = "Bones";
    private String location = "Dog pound";

    public Dog() {
    }

    public Dog(String say, String size, String food, String location){
        this.food = food;
        this.location = location;
        this.say = say;
        this.size = size;
    }

    @Override
    public String getFood() {

        return food;
    }

    @Override
    public String getLocation() {

        return location;
    }

    public String getSay() {
        return say;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void eat() {
        System.out.println("Кушает и чавкает");
//если в этом классе пишем GetFood, то на выводе получаем то, что ест пёс. не сработает без     public String getFood() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Гавкает");

    }
}
