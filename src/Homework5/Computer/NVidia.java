package Homework5.Computer;

public class NVidia extends PCassembly {
    private static String manufacturer = "NVidia";
    private static String memoryType = "GDDR5";
    private static int memory = 6144;

    public NVidia (String manufacturer, String memoryType, int memory) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.memory = memory;

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
