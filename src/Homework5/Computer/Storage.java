package Homework5.Computer;

import Homework5.Computer.storage.MakeInsertHDD;
import Homework5.Computer.storage.MakeInsertSSD;

import java.util.Scanner;

public class Storage {
    private String manufacturer;
    private int memory;
    private float formFactor;

    public void orderStorage() {
        System.out.println("Заказываем Хранилище:");
    }

    public void chooseStorage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tКакое хранилище информации? Homework6.1-HDD, 2-SSD");
        String choose = scanner.nextLine();
        MakeInsert make = null;

        switch (choose) {
            case "1":
                make = new MakeInsertHDD();
                break;
            case "2":
                make = new MakeInsertSSD();
                break;
            default:
        }

        if (choose != null) {
            Insert insert = make.makeinsert();
            insert.set();
        }
    }
}
