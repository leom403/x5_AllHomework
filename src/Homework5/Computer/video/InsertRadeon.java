package Homework5.Computer.video;

import Homework5.Computer.Insert;
import Homework5.Computer.VideoCard;

public class InsertRadeon extends VideoCard implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + Radeon.manufacturer() + "\tТип памяти: " + Radeon.memoryType() + "\tОбъём памяти: " + Radeon.memory());
    }
}