package Homework5.Computer.storage;

import Homework5.Computer.Insert;
import Homework5.Computer.Storage;

public class InsertHDD extends Storage implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + HDD.manufacturer() + "\tОбъём памяти: " + HDD.memory() + " " + HDD.formfactor());
    }
}
