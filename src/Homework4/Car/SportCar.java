package Homework4.Car;

public class SportCar extends Car {
    private int maxSpeed;


    @Override
    void start() {
        System.out.println("Спорткар поехал");
    }

    @Override
    void stop() {
        System.out.println("Спорткар остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Брэнд: " + getCarBrand() + " Класс: " + getCarClass() + " массой: " + getWeight() + " и макс скоростью: " + getMaxSpeed() + "км/ч " + "; Двигатель " + getMotor());
    }

    public SportCar(String carBrand, String carClass, float weight, int maxSpeed, Engine motor) {
        super(carBrand, carClass, weight, motor);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}
