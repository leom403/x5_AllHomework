package Homework5.Computer;

import java.util.Scanner;

public class Processor {
    private String name;
    private String manufacturer;
    private float clockFrequence;
    private int numberOfCores;
    private int cacheMemory;

    public void orderProc() {
        System.out.println("Заказываем Процессор:");
    }


    public void chooseProcessor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tКакой процессор ставим? 1-Inter, 2-AMD");
        String choose = scanner.nextLine();
        MakeInsert make = null;

        switch (choose) {
            case "1":
                make = new MakeInsertIntel();
                break;
            case "2":
                make = new MakeInsertAMD();
                break;
            default:
        }

        if (choose != null) {
            Insert insert = make.makeinsert();
            insert.set();
        }
    }
}

