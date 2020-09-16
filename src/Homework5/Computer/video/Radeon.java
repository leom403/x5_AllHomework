package Homework5.Computer.video;

import Homework5.Computer.PCassembly;

public class Radeon extends PCassembly {
    private static String manufacturer = "Radeon";
    private static String memoryType = "DDR3";
    private static int memory = 4096;

    public Radeon(String manufacturer, String memoryType, int memory, String coolingStrategy) {
        Radeon.manufacturer = manufacturer;
        Radeon.memoryType = memoryType;
        Radeon.memory = memory;
    }

    public static String memoryType() {
        return memoryType;
    }

    public static int memory() {
        return memory;
    }

    public static String manufacturer() {
        return manufacturer;
    }
}
