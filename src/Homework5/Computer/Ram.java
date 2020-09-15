package Homework5.Computer;

import java.util.Scanner;

public class Ram {
    private String manufacturer;
    private int memory;
    private int clockFrequence;
    private String memoryType;

    public void orderRam() {
        System.out.println("Заказываем ОЗУ:");
    }

    public void chooseRam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько нужно ОЗУ? 1-8 GB, 2-16 GB");
        String choose = scanner.nextLine();
        MakeInsert make = null;

        switch (choose) {
            case "1":
                make = new MakeInsertRam8();
                break;
            case "2":
                make = new MakeInsertRam16();
                break;
            default:
        }

        if (choose != null) {
            Insert insert = make.makeinsert();
            insert.set();
        }
    }
}

