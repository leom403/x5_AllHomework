package Homework5.Computer.ram;

import Homework5.Computer.Insert;
import Homework5.Computer.VideoCard;

public class InsertRam16 extends VideoCard implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + Ram16.manufacturer() + "\tТип памяти: " + Ram16.memoryType() + "\tОбъём памяти: " + Ram16.memory() + "GB и частотой: " + Ram16.clockfrequence() + "Mhz" );
    }
}