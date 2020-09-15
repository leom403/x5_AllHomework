package Homework5.Computer;

public class InsertHDD extends Storage implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + HDD.manufacturer() + "\tОбъём памяти: " + HDD.memory() + " " + HDD.formfactor());
    }
}
