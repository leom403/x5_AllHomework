package Homework3.part2_Animal;

public class Dog extends Animal {
    private String say = "Bark! Bark!";
    private String size = "Middle";

    public Dog(String say, String size, String food, String location){
        super(food, location);
        this.say = say;
        this.size = size;
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
