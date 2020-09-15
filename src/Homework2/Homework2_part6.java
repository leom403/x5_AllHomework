package Homework2;

import java.util.Scanner;

public class Homework2_part6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число в консоли:");
        int a = scanner.nextInt();
        String positive = "Число положительное";
        String even = ", чётное";
        String negative = "Число отрицательное";
        String odd = ", нечётное";
        String zero = "Нулевое число";
        String positiveOrNegative;
        String evenOrOdd;

        if (a > 0) {
            positiveOrNegative = positive;
        } else if (a == 0) {
            positiveOrNegative = zero;
        } else {
            positiveOrNegative = negative;
        }

        if (a == 0) {
            evenOrOdd = "";
        } else if (a % 2 == 0) {
            evenOrOdd = even;
        } else {
            evenOrOdd = odd;
        }
        System.out.println(positiveOrNegative + evenOrOdd);
    }
}