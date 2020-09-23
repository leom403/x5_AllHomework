package Homework4.Car;

public class Engine {
    private int power;                    //будет в лошадях
    private String manufacturer;

    public Engine(String manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPower() {
        return power;
    }

    public String getEngine() {
        return manufacturer + " " + power + "км/ч";
    }
}