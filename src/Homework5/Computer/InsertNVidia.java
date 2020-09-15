package Homework5.Computer;

public class InsertNVidia extends VideoCard implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + NVidia.manufacturer() + "\tТип памяти: " + NVidia.memoryType() + "\tОбъём памяти: " + NVidia.memory() + "\t");
    }
}
