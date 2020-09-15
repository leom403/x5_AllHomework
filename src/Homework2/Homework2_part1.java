package Homework2;

import java.util.Scanner;

public class Homework2_part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + " последняя цифра в числе: " + a % 10);
    }
}
