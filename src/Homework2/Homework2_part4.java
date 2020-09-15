package Homework2;

import java.util.Scanner;

public class Homework2_part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0) {
            a += 1;
        } else if (a < 0) {
            a -= 2;
        } else {
            a = 10;
        }
        System.out.println(a);
    }
}