package Homework5.Computer.storage;

import Homework5.Computer.PCassembly;

public class SSD extends PCassembly {
    private static String manufacturer = "Unknown SSD";
    private static int memory = 1000;
    private static float formFactor = 2.5f;

    public SSD (String manufacturer, int memory, float formFactor) {
        SSD.manufacturer = manufacturer;
        SSD.memory = memory;
        SSD.formFactor = formFactor;
    }

    public  static String manufacturer() {
        return manufacturer;
    }

    public static int memory() {
        return memory;
    }
    public static float formfactor() {
        return formFactor;
    }


}
