package Homework4.Car;

import javax.swing.text.Style;

public abstract class Car {
    private String carBrand;
    private String carClass;
    private float weight;
    private String motor;

    public abstract void start();

    public abstract void stop();

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        System.out.println("Повторот направо");
    }

    public abstract void printInfo();

    public Car(String carBrand, String carClass, float weight, Engine motor) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.motor = motor.getEngine();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public float getWeight() {
        return weight;
    }

    public String getMotor() {
        return motor;
    }
}