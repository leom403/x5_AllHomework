package Homework5.Computer.storage;

import Homework5.Computer.Insert;
import Homework5.Computer.Storage;

public class InsertSSD extends Storage implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + SSD.manufacturer() + "\tОбъём памяти: " + SSD.memory() + " " + SSD.formfactor());
    }
}
