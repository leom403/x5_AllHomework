package Homework4.Car;

public class Lorry extends Car {
    private float liftingCapacity;              // в тоннах


    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Брэнд: " + getCarBrand() + " Класс: " + getCarClass() + " массой: " + getWeight() + " и макс грузоподъемностью:" + getLiftingCapacity() + "тонн");
        System.out.println("Двигатель производства: " + getMotor());
    }

    public Lorry(String carBrand, String carClass, float weight, float liftingCapacity, Engine motor) {
        super(carBrand, carClass, weight, motor);
        this.liftingCapacity = liftingCapacity;
    }

    public float getLiftingCapacity() {
        return liftingCapacity;
    }
}
