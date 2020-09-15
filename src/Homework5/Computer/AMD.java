package Homework5.Computer;

public class AMD extends Processor{
    private static String name = "AMD Phenom X4";
    private static String manufacturer = "AMD";
    private static float clockFrequence = 2.1f;
    private static int numberOfCores = 3;
    private static int cacheMemory = 2;

    public AMD (String name, String manufacturer, float clockFrequence, int numberOfCores, int cacheMemory) {
        AMD.name = name;
        AMD.manufacturer = manufacturer;
        AMD.clockFrequence = clockFrequence;
        AMD.numberOfCores = numberOfCores;
        AMD.cacheMemory = cacheMemory;
    }

    public static String getName() {
        return name;
    }
    public static String getManufacturer() {
        return manufacturer;
    }
    public static float getClockFrequence(){
        return clockFrequence;
    }
    public static int getNumberOfCores() {
        return numberOfCores;
    }
    public static int getCacheMemory() {
        return cacheMemory;
    }



}
