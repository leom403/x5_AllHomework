package Homework5.Computer;

public class InsertSSD extends Storage implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + SSD.manufacturer() + "\tОбъём памяти: " + SSD.memory() + " " + SSD.formfactor());
    }
}
