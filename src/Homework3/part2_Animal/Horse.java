package Homework3.part2_Animal;

public class Horse extends Animal {
    private String say = "I-go-go";
    private String size = "Tall";
    private int numberOfHooves = 4;
    private boolean canBeMount;
    private String food = "Oats";
    private String location = "Prairie";

    public Horse() {

    }

    public Horse(String say, String size, int NumberOfHooves, boolean canBeMount, String food, String location) {
        this.say = say;
        this.size = size;
        this.food = food;
        this.location = location;
        this.numberOfHooves = NumberOfHooves;
        this.canBeMount = canBeMount;
    }

    @Override
    public void eat() {
        System.out.println("Кушает и ... кушает. Овёс."); //не знаю, как едят лошади

    }

    @Override
    public void makeNoise() {
        System.out.println("Делает тыгыдык, пока не спит.");

    }

    @Override
    public void sleep() {
        System.out.println("Умеет спать стоя, не то что остальные");

    }

    @Override
    public String getFood() {

        return food;
    }

    public String getSay() {
        return say;
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfHooves() {
        return numberOfHooves;
    }

    public boolean isCanBeMount() {
        return true;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
