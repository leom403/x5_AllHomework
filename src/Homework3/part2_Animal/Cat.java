package Homework3.part2_Animal;

public class Cat extends Animal {
    private String say = "Meow";
    private String size = "Small";
    private boolean makePurrr;
    private String food = "Mouse";
    private String location = "Home";

    public Cat() {

    }

    public Cat(String say, String size, boolean makePurrr, String food, String location) {
        this.food = food;
        this.location = location;
        this.makePurrr = makePurrr;
        this.say = say;
        this.size = size;
    }

    public String getSay() {
        return say;
    }

    public String getSize() {
        return size;
    }

    public boolean isMakePurrr() {
        return true;
    }

    @Override
    public void eat() {
        System.out.println("Кушает тихо и мурлычет");

    }

    @Override
    public void makeNoise() {
        System.out.println("Бесшумное, словно тень");

    }

    @Override
    public String getFood() {

        return food;
    }

    @Override
    public String getLocation() {

        return location;
    }


}
