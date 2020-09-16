package Homework5.Computer.ram;

import Homework5.Computer.PCassembly;

public class Ram8 extends PCassembly {
    private static String manufacturer = "Silicon Power";
    private static int memory = 4;
    private static int clockFrequence = 1337;
    private static String memoryType = "DDR3";

    public Ram8 (String manufacturer, int memorym, int clockFrequence, String memoryType){
        Ram8.manufacturer = manufacturer;
        Ram8.memory = memorym;
        Ram8.clockFrequence =clockFrequence;
        Ram8.memoryType = memoryType;
    }

    public static String manufacturer() {
        return manufacturer;
    }
    public static int memory() {
        return memory;
    }
    public static int clockFrequence() {
        return clockFrequence;
    }
    public static String memoryType() {
        return memoryType;
    }

}
