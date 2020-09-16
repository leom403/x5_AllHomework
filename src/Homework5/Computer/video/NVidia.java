package Homework5.Computer.video;

import Homework5.Computer.PCassembly;

public class NVidia extends PCassembly {
    private static String manufacturer = "NVidia";
    private static String memoryType = "GDDR5";
    private static int memory = 6144;

    public NVidia (String manufacturer, String memoryType, int memory) {
        NVidia.manufacturer = manufacturer;
        NVidia.memoryType = memoryType;
        NVidia.memory = memory;

    }

    public static String manufacturer() {
        return manufacturer;
    }

    public static String memoryType() {
        return memoryType;
    }

    public static int memory() {
        return memory;
    }

}
