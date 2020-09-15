package Homework5.Computer;

public class HDD extends PCassembly {
    private static String manufacturer = "Unknown HDD";
    private static int memory = 500;
    private static float formFactor = 3.5f;

    public HDD (String manufacturer, int memory, float formFactor) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.formFactor = formFactor;
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
