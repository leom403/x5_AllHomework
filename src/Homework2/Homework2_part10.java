package Homework2;// пришлось гуглить. Самое понятное оказалось тут https://www.w3resource.com/java-exercises/array/java-array-exercise-26.php

public class Homework2_part10 {
    public static void main(String[] args) {
        int[] numb = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.print("Дан массив чисел: \n[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]");

        int count = 0;
        for (int i = 0; i < numb.length; ) {
            if (numb[i] == 0) {
                i++;
            } else {
                int tempotral = numb[count];
                numb[count] = numb[i];
                numb[i] = tempotral;
                count++;
                i++;
            }
        }

        while (count < numb.length) {
            numb[count++] = 0;
        }
        System.out.print("\nМассив чисел после перемещения нулей в конец: \n");
        for (int n : numb) {
            System.out.print(n + " ");
        }
    }
}
