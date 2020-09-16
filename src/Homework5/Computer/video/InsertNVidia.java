package Homework5.Computer.video;

import Homework5.Computer.Insert;
import Homework5.Computer.VideoCard;

public class InsertNVidia extends VideoCard implements Insert {

    @Override
    public void set() {
        System.out.println("\t" + NVidia.manufacturer() + "\tТип памяти: " + NVidia.memoryType() + "\tОбъём памяти: " + NVidia.memory() + "\t");
    }
}
