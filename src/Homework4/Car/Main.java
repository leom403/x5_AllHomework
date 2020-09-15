package Homework4.Car;

public class Main {
    public static void main(String[] args) {
//грузовичек
        Car bigcar = new Lorry("KAMAZ", "Lorry", 1600, 2.3f, new Engine("Unknown", 110));
        bigcar.start();
        bigcar.stop();
        bigcar.printInfo();

        Car ballid = new SportCar("F1", "Ballid", 733, 330, new Engine("Ferrari 059/3 1,6 V6T", 330));
        ballid.start();
        ballid.start();
        ballid.printInfo();
    }
}
