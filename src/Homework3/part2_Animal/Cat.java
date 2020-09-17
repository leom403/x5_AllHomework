package Homework3.part2_Animal;

public class Cat extends Animal {
    private String say = "Meow";
    private String size = "Small";
    private boolean makePurrr;

    public Cat(String say, String size, boolean makePurrr, String food, String location) {
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


}
