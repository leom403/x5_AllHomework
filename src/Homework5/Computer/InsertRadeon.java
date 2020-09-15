package Homework5.Computer;

public class InsertRadeon extends VideoCard implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + Radeon.manufacturer() + "\tТип памяти: " + Radeon.memoryType() + "\tОбъём памяти: " + Radeon.memory());
    }
}