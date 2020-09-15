package Homework5.Computer;

import java.util.Scanner;

public class VideoCard {
    private String manufacturer;
    private String memoryType; //тип памяти видео
    private int memory;
    private String coolingStrategy;

    public void orderVideo() {
        System.out.println("Заказываем Видеокарту: " );
    }

    public void chooseVideo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какую карту ставим? 1-Nvidia, 2-Radeon");
        String choose = scanner.nextLine();
        MakeInsert make = null;

        switch (choose) {
            case "1":
                make = new MakeInsertNvidia();
                break;
            case "2":
                make = new MakeInsertRadeon();
                break;
            default:
        }

        if (choose != null) {
            Insert insert = make.makeinsert();
            insert.set();
        }
    }
}
