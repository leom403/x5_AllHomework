package Homework5.Computer.ram;

import Homework5.Computer.PCassembly;

public class Ram16 extends PCassembly {
    private static String manufacturer = "Corsair";
    private static int memory = 16;
    private static int clockFrequence = 3200;
    private static String memoryType = "DDR4";

    public Ram16 (String manufacturer, int memorym, int clockFrequence, String memoryType){
        Ram16.manufacturer = manufacturer;
        Ram16.memory = memorym;
        Ram16.clockFrequence =clockFrequence;
        Ram16.memoryType = memoryType;
    }

    public static String manufacturer() {
        return manufacturer;
    }
    public static int memory() {
        return memory;
    }
    public static int clockfrequence() {
        return clockFrequence;
    }
    public static String memoryType() {
        return memoryType;
    }

}
