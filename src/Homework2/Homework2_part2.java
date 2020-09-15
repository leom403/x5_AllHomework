package Homework2;

import java.util.Scanner;

public class Homework2_part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();              // не мог вывести целое число в вывод, решил преобразовывать строку в число. Потом додумался, что можно было, например, ввести 3 переменную и выводить 1, а 3 приравнивать в While
        int a = Integer.parseInt(s);

        int b = 0;
        while (a > 0) {
            b = b + a % 10;
            a = a / 10;
        }
        System.out.println(s + " и сумма цифр: " + b);
    }
}
