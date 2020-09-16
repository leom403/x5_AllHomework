package Homework5.Computer.storage;

import Homework5.Computer.PCassembly;

public class HDD extends PCassembly {
    private static String manufacturer = "Unknown HDD";
    private static int memory = 500;
    private static float formFactor = 3.5f;

    public HDD (String manufacturer, int memory, float formFactor) {
        HDD.manufacturer = manufacturer;
        HDD.memory = memory;
        HDD.formFactor = formFactor;
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
