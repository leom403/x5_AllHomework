package Homework5.Computer.processor;

import Homework5.Computer.Processor;

public class Intel extends Processor {
    private static String name = "Core i5";
    private static String manufacturer = "Intel";
    private static float clockFrequence = 3.7f;
    private static int numberOfCores = 4;
    private static int cacheMemory = 8;

    public Intel (String name, String manufacturer, float clockFrequence, int numberOfCores, int cacheMemory) {
        Intel.name = name;
        Intel.manufacturer = manufacturer;
        Intel.clockFrequence = clockFrequence;
        Intel.numberOfCores = numberOfCores;
        Intel.cacheMemory = cacheMemory;
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
