package Homework2;

import java.util.Arrays;

public class Homework2_part9 {
    public static void main(String[] args) {
        int[] numb = {15, 10, 51, -6, 5, 3, -10, 34, 0, 32, 56, -12, 24, -52};
        System.out.println("Дан массив чисел: [15, 10, 51, -6, 5, 3, -10, 34, 0, 32, 56, -12, 24, -52]");

        for (int i = 0; numb.length / 2 > i; i++) {
            int X = numb[i];
            numb[i] = numb[numb.length - i - 1];
            numb[numb.length - i - 1] = X;
        }
        System.out.println("Элементы в обратном порядке: " + Arrays.toString(numb));
    }
}
