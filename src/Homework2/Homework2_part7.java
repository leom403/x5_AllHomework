package Homework2;

import java.util.Scanner;

public class Homework2_part7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код города: ");
        System.out.println("\t905 - Москва" + "\t 194 - Ростов" + "\n\t491 - Краснодар" + "\t 800 - Киров");

        int code = scanner.nextInt();
        int timer = 10;                 //в минутах
        switch (code) {
            case 905:
                double cost905 = 4.15 * timer;
                System.out.println("Звоним в Москву. Стоимость разговора за 10 минут составить: " + cost905 + " руб.");
                break;
            case 194:
                double cost194 = 1.98 * timer;
                System.out.println("Звоним в Ростов. Стоимость разговора за 10 минут составить: " + cost194 + " руб.");
                break;
            case 491:
                double cost491 = 2.69 * timer;
                System.out.println("Звоним в Краснодар. Стоимость разговора за 10 минут составить: " + cost491 + " руб.");
                break;
            case 800:
                double cost800 = 5.00 * timer;
                System.out.println("Звоним в Киров. Стоимость разговора за 10 минут составить: " + cost800 + " руб.");
                break;
            default:
                System.out.println("Неверный номер. Введите из имеющихся.");
        }
    }
}

