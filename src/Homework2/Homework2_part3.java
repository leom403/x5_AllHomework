package Homework2;

import java.util.Scanner;

public class Homework2_part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 0) {
            a += 1;
        }
        System.out.println(a);
    }
}
