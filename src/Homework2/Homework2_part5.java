package Homework2;

import java.util.Scanner;

public class Homework2_part5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();

        for (int i = 1; i < 3; ++i) {                       // не понимал. что ограничивает ввод с клавиатуры, думал, что это можно сделать только выставив ограничитель, как в строке массива, например.
            int currentValue = scanner.nextInt();           // оказалось, что с фором тоже можно. Он принимает от i 3 значения на ввод и затем сравнивает их между собой
            if (currentValue < min) {
                min = currentValue;
            }
        }
        System.out.println(min);
    }
}
