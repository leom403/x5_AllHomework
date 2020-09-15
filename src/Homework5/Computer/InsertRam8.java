package Homework5.Computer;

public class InsertRam8 extends VideoCard implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + Ram8.manufacturer() + "\tТип памяти: " + Ram8.memoryType() + "\tОбъём памяти: " + Ram8.memory() + "GB и частотой: " + Ram8.clockFrequence() + "Mhz" );
    }
}