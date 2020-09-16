package Homework5.Computer.processor;

import Homework5.Computer.Insert;
import Homework5.Computer.Processor;

public class InsertIntel extends Processor implements Insert {
    @Override
    public void set() {
        System.out.println("\t" + Intel.getManufacturer() + ": " + Intel.getName() + "с частотой: " + Intel.getClockFrequence() + " ," + Intel.getNumberOfCores() + " Ядра. Кэш:" + Intel.getCacheMemory());
    }
}
