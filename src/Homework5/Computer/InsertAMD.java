package Homework5.Computer;

public class InsertAMD extends Processor implements Insert {
    @Override
    public void set() {
        System.out.println("\t" + AMD.getManufacturer() + ": " + AMD.getName() + "с частотой: " + AMD.getClockFrequence() + " ," + AMD.getNumberOfCores() + " Ядра. Кэш:" + AMD.getCacheMemory());
    }
}
